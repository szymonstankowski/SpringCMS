package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.app.dao.ArticleDao;
import pl.coderslab.app.entity.Article;

@Controller
@RequestMapping("/article")
public class ArticleController {

    private ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao){
        this.articleDao=articleDao;
    }

    @RequestMapping("/get/{id}")
    public String getArticle(@PathVariable long id){
        Article article = articleDao.findById(id);
        return article.toString();
    }
}
