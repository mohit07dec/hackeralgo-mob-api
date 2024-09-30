package com.hackeralgo.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Data
@Entity
@Table(name = "AppUser")
public class User {
    @Id
    private String emailId;

    @Column(unique = true)
    private Long mobileNum;

    private String firstNm;
    private String lastNm;
    private String profileDetails;

    @Lob
    private Blob picture;

    private String country;
}
