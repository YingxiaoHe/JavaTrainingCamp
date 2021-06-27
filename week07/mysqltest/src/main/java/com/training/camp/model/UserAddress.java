package com.training.camp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_address")
public class UserAddress {

    @Id
    @Column(length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     * {@link User#id}
     */
    @Column
    private Long userId;

    /**
     * 详细地址
     */
    @Column
    private String address = "";

    /**
     * 联系人昵称
     */
    @Column
    private String contacts = "";

    /**
     * 联系电话
     */
    @Column
    private String telephone = "";

    /**
     * 地址所属地区行政编码
     */
    @Column
    private String areaCode = "000000";

}
