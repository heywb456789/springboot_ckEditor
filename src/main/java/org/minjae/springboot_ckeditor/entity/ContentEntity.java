package org.minjae.springboot_ckeditor.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ContentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String content;
}
