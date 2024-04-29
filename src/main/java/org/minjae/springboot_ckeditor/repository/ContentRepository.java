package org.minjae.springboot_ckeditor.repository;

import org.minjae.springboot_ckeditor.entity.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<ContentEntity, Long> {
}
