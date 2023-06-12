package com.demos.arche7.project.service.Article;

import com.demos.arche7.project.model.Article;

import java.util.List;

public interface ArticleService {
    Iterable<Article> getAllArticles();

    Article saveArticle(Article article);

    Article updateArticle(Article article);


    Article rechercheRef(String ref);

    List<Article> findByDesignation(String designation);
}
