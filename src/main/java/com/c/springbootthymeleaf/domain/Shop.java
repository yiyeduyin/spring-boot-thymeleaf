package com.c.springbootthymeleaf.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * shop
 */
@Entity
@Table(name = "t_shop")
public class Shop implements Serializable {

    private static final long serialVersionUID = -719995947047957874L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String province;

    private Integer provinceCode;

    private String address;

    private String market;

    private String phone;

    private String picture;
}
