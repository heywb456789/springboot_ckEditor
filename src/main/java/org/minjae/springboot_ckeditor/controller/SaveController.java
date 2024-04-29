package org.minjae.springboot_ckeditor.controller;

import org.minjae.springboot_ckeditor.dto.SaveDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveController {

    @PostMapping("/save")
    public String save(SaveDTO saveDTO) {

        System.out.println(saveDTO.toString());

        return "redirect:/";
    }
}
