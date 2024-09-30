package com.hackeralgo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Question")
public class Question {
    @Id
    private String questionId;

    private String question;
    private String answereText;
    private String voiceUrl;
    private BigDecimal duration;
    private Boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
