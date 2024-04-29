package org.minjae.springboot_ckeditor.controller;

import org.minjae.springboot_ckeditor.dto.SaveDTO;
import org.minjae.springboot_ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveController {

    private ContentService contentService;

    //단일 생성자는 생략 가능하지만 복수개가 된다면 @autowired 붙여야한다.
    //생성자 주입 방식을 사용할 경우 순환 참조를 방지할 수 있다 .
    @Autowired //생성자 주입 방식
    public SaveController(ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping("/save")
    public String save(SaveDTO saveDTO) {

        System.out.println(saveDTO.toString());

        contentService.save(saveDTO);

        return "redirect:/list";
    }
}
