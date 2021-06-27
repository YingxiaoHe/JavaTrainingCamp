package com.training.camp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    private String id;

    /**
     * 用户id
     * {@link User#id}
     */
    @Column
    private Long userId;

    /**
     * 订单名称
     */
    @Column
    private String name;

    /**
     * 订单快照地址
     */
    @Column
    private String snapshot;

    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());

    /**
     * 修改时间
     */
    @Column
    private Timestamp updateTime;

    /**
     * 付款时间
     */
    @Column
    private Timestamp paymentTime;

    /**
     * 发货时间
     */
    @Column
    private Timestamp deliveryTime;

    /**
     * 收货时间
     */
    @Column
    private Timestamp receliveTime;

    /**
     * 订单状态
     */
    @Column
    private Integer status;

}
