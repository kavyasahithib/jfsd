package com.example.article.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.article.model.summary;

@Repository
public interface summaryRepository extends JpaRepository<summary, Long> {
    
    // Custom method to find summary by article ID
    summary findByArticleId(Long articleId);
}
