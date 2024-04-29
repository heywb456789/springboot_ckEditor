package org.minjae.springboot_ckeditor.controller;

import org.minjae.springboot_ckeditor.dto.SaveDTO;
import org.minjae.springboot_ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveController {

    private ContentService contentService;

    //���� �����ڴ� ���� ���������� �������� �ȴٸ� @autowired �ٿ����Ѵ�.
    //������ ���� ����� ����� ��� ��ȯ ������ ������ �� �ִ� .
    @Autowired //������ ���� ���
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
