package com.nuwan.stylemaster.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "STYLE_MASTER")
public class StyleMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String styleCode;
    private String styleName;
    private Number styleQuantity;
    private String status;
    private String styleType;
}
