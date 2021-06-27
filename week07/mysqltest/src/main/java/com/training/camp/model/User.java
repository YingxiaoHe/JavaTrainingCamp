package com.training.camp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @Column(length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 昵称
     */
    @Column
    private String name = "";

    /**
     * 账号
     */
    @Column
    private String account = "";

    /**
     * 密码
     */
    @Column
    private String password = "";

    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());

    /**
     * 修改时间
     */
    @Column
    private Timestamp updateTime = new Timestamp(System.currentTimeMillis());

}
