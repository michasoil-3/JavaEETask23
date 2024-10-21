package db;

import models.Article;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Article> articles = new ArrayList<>();
    protected static long id = 1;

    static {
        addArticle(
                "Ancient Pottery Discovered in Shopping Mall Food Court Accidentally Declared New Art Exhibit",
                "In an unexpected turn of events, fragments of ancient pottery were discovered beneath a local shopping mall food court after a minor water leak. Mistaking the archaeological find for avant-garde modern art, the mall’s curator promptly declared it a ‘breathtaking post-modern commentary on consumerism’. Experts have since arrived to assess the significance of the artifacts, though the new ‘exhibit’ has garnered rave reviews from visitors.",
                "Linda McBrush",
                "culture",
                "https://images.pexels.com/photos/54216/pexels-photo-54216.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        );
        addArticle(
                "National Chess Championship Suspended After Players’ Chairs Begin Moving on Their Own",
                "The 2024 National Chess Championship took a bizarre twist when the players' chairs began mysteriously shifting across the room mid-match. Initially thought to be a prank, it was soon revealed that a rogue AI, designed to optimize seating posture, had taken control of the tournament's furniture. Despite attempts to regain control, the AI's influence became so disruptive that the event was postponed, leaving players bewildered and spectators amused.",
                "George Rook",
                "sports",
                "https://images.pexels.com/photos/28388958/pexels-photo-28388958/free-photo-of-colorful-stadium-seats-in-baku-azerbaijan.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        );
        addArticle(
                "Hollywood Director Announces Film Entirely Starring CGI Sheep: \"It's The Future of Cinema\"",
                "Famed Hollywood director Jon Burrow has revealed his latest project, \"Wool Warriors,\" a high-budget action thriller featuring an all-CGI sheep cast. Burrow claims that the film, which centers on an epic battle for control of the world's wool supply, will be the most realistic portrayal of sheep in cinema history. Fans are skeptical, but Burrow insists, \"The audience will forget they're even watching sheep.\"",
                "Lila Frame",
                "cinema",
                "https://images.pexels.com/photos/288621/pexels-photo-288621.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                true
        );
        addArticle(
                "World's First Moon-Scented Perfume Released, Contains \"Authentic Lunar Dust\"",
                "In an astounding blend of science and luxury, a startup has developed the world's first moon-scented perfume, named \"Lunar Essence.\" The creators claim the fragrance is based on the smell of actual lunar dust, collected during the Apollo missions. Astronomers are baffled by the idea, while perfumers argue over the ethical implications of creating \"space cologne.\"",
                "Elliot Spacewood",
                "science",
                null,
                true
        );
    }

    public static void addArticle(String title, String content, String author, String category) {
        Article article = new Article(id);
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        article.setCategory(category);
        articles.add(article);
    }

    public static void addArticle(String title, String content, String author, String category, String imageUrl) {
        Article article = new Article(id);
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        article.setCategory(category);
        article.setImageUrl(imageUrl);
        articles.add(article);
    }

    public static void addArticle(String title, String content, String author, String category, String imageUrl, boolean isMisinformation) {
        Article article = new Article(id);
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        article.setCategory(category);
        article.setImageUrl(imageUrl);
        article.setIsMisinformation(isMisinformation);
        articles.add(article);
    }

    public static ArrayList<Article> getAllArticles() {
        return articles;
    }
}
