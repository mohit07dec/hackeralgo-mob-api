package com.hackeralgo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    private String courseId;

    private String courseTitle;
    private String courseDescription;

    @Lob
    private Blob courseImage;

    private String comment;
    private BigDecimal courseRating;
    private Boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    @OneToMany(mappedBy = "course")
    private List<CourseQaMapping> questions;
}
