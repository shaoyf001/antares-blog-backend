package org.example.antares.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.antares.blog.model.dto.article.ArticleCreateRequest;
import org.example.antares.blog.model.dto.article.ArticleQueryRequest;
import org.example.antares.blog.model.entity.Article;
import org.example.antares.blog.model.vo.article.ArticleContentVo;
import org.example.antares.blog.model.vo.article.ArticleVo;
import org.example.antares.common.model.response.R;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Antares
* @description 针对表【article(文章表)】的数据库操作Service
* @createDate 2023-03-24 20:40:13
*/
public interface ArticleService extends IService<Article> {
    Long createDraft(ArticleCreateRequest articleCreateRequest, HttpServletRequest request);

    ArticleVo getArticleCoverById(Long id, HttpServletRequest request);

    ArticleVo getArticleBasicById(Long id);

    void updateBasicById(Long id, ArticleCreateRequest articleCreateRequest, HttpServletRequest request);

    ArticleContentVo getArticleContentById(Long id);

    void updateContentById(Long id, String content, HttpServletRequest request);

    void publishArticle(Long id, ArticleContentVo articleContentVo, HttpServletRequest request);

    Page<ArticleVo> getArticlesByUid(ArticleQueryRequest articleQueryRequest, HttpServletRequest request);

    List<ArticleVo> getArticlesByIds(List<Long> articleIds, HttpServletRequest request);

    Page<ArticleVo> listArticleVoByPage(ArticleQueryRequest articleQueryRequest, HttpServletRequest request);

    List<Article> getHots();

    List<Article> getGlobalTop();

    Page<ArticleVo> getUpdates(ArticleQueryRequest articleQueryRequest, HttpServletRequest request);

    void deleteArticle(Long id, HttpServletRequest request);
}
