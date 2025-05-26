package com.example.newsapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SummaryDTO {

    private Long summaryId;     // The ID of the summary
    private Long articleId;     // The ID of the article
    private String articleTitle; // The title of the article
    private String summaryTree;  // The JSON summary tree
}
