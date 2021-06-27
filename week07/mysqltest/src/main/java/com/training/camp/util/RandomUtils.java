package com.training.camp.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Slf4j
public class RandomUtils<DTO> {

    public final static Random RANDOM = new Random();

    private final Class<DTO> clazz;

    public RandomUtils(Class<DTO> clazz) {
        this.clazz = clazz;
    }

    public DTO createRandomDTO() {
        Class<DTO> type = this.clazz;
        try {
            DTO dto = type.newInstance();
            for (Field field : type.getDeclaredFields()) {
                String fieldModifier = Modifier.toString(field.getModifiers());
                if (fieldModifier.contains("static") || fieldModifier.contains("final")) {
                    continue;
                }
                setFieldsRandomValue(dto, field);
            }
            return dto;
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("", e);
        }
        return null;
    }

    private void setFieldsRandomValue(Object object, Field field) throws IllegalAccessException {
        field.setAccessible(true);

        if ("id".equals(field.getName())) {
            switch (field.getType().toString()) {
                case "class java.lang.String":
                    String value = field.getName() + "-" + UUID.randomUUID();
                    value = value.substring(0, 32);
                    field.set(object, value);
                    break;
                case "class java.lang.Long":
                    // 数据库的id字段是Long型时说明是自增主键，不设置
                default:
                    return;
            }
        }

        switch (field.getType().toString()) {
            case "class java.lang.Integer":
                field.set(object, 1 + RANDOM.nextInt(100));
                break;
            case "class java.lang.Long":
                field.set(object, 0L);
                break;
            case "class java.lang.Double":
                field.set(object, RANDOM.nextInt(5) * 0.95);
                break;
            case "class java.lang.String":
                String value = field.getName() + "-" + UUID.randomUUID();
                value = value.substring(0, 32);
                field.set(object, value);
                break;
            case "class java.util.Date":
                field.set(object, new Date());
                break;
            case "class java.sql.Timestamp":
                field.set(object, new Timestamp(System.currentTimeMillis()));
                break;
            default:
                break;
        }
    }
}
