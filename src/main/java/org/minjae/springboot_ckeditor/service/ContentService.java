package org.minjae.springboot_ckeditor.service;

import org.minjae.springboot_ckeditor.dto.SaveDTO;
import org.minjae.springboot_ckeditor.entity.ContentEntity;
import org.minjae.springboot_ckeditor.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    private ContentRepository contentRepository;

    @Autowired
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public void save(SaveDTO saveDTO) {
        String title = saveDTO.getTitle();
        String content = saveDTO.getContent();

        ContentEntity contentEntity = new ContentEntity();

        contentEntity.setTitle(title);
        contentEntity.setContent(content);

        contentRepository.save(contentEntity);

    }

    public List<ContentEntity> findAll() {
        return contentRepository.findAll();
    }

    public ContentEntity findById(Long id) {
        ContentEntity contentEntity = contentRepository.findById(id).orElse(null);
        return contentEntity;
    }

    public void deleteById(Long id) {
        contentRepository.deleteById(id);
    }
}
