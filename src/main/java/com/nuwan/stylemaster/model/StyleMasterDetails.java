package com.nuwan.stylemaster.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "STYLE_MASTER_DETAILS")
public class StyleMasterDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemCode;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private ItemCategory itemCategory;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private StyleMaster styleMaster;
}
