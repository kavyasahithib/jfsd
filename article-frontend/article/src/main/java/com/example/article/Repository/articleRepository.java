package com.example.article.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.article.model.article;

@Repository
public interface articleRepository extends JpaRepository<article, Long> {
    // Custom query methods if needed, e.g., findByTitle(String title)
}
