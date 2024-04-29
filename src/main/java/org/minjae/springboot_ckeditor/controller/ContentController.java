package org.minjae.springboot_ckeditor.controller;

import org.minjae.springboot_ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ContentController {

    private ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/content/{id}")
    public String content(@PathVariable Long id , Model model) {

        model.addAttribute("Content" , contentService.findById(id));
        System.out.println(contentService.findById(id).toString());
        return "content";
    }

    @DeleteMapping("/content/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        contentService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
