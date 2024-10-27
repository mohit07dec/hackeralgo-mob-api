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
    private long questionId;

    private String audioUrl;
    private String questionText;
    private String answerText;
    private String difficulty;
    private String category;
    private BigDecimal duration;
    private Boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
