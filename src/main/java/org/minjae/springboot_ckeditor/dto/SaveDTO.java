package org.minjae.springboot_ckeditor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SaveDTO {
    private String title;
    private String content;
}
