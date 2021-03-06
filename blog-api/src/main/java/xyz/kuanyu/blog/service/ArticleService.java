package xyz.kuanyu.blog.service;

import xyz.kuanyu.blog.vo.ArticleVo;
import xyz.kuanyu.blog.vo.Result;
import xyz.kuanyu.blog.vo.params.ArticleParam;
import xyz.kuanyu.blog.vo.params.PageParams;

import java.util.List;

public interface ArticleService {

    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();

    Result findArticleById(Long articleId);

    Result publish(ArticleParam articleParam);
}
