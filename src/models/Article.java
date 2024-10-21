package models;

public class Article {
    long id;
    String title;
    String content;
    String author;
    String category;
    String imageUrl;
    boolean isMisinformation;

    public Article() {
    }

    public Article(long id) {
        this.id = id;
    }

    public Article(long id, String title, String content, String author, String category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.imageUrl = null;
        this.isMisinformation = false;
    }

    public Article(long id, String title, String content, String author, String category, String imageUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.imageUrl = imageUrl;
        this.isMisinformation = false;
    }

    public Article(long id, String title, String content, String author, String category, String imageUrl, boolean isMisinformation) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.imageUrl = imageUrl;
        this.isMisinformation = isMisinformation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isMisinformation() {
        return isMisinformation;
    }

    public void setIsMisinformation(boolean isMisinformation) {
        this.isMisinformation = isMisinformation;
    }
}
