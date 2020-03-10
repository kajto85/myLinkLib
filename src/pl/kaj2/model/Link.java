package pl.kaj2.model;

public class Link {

    private long id;
    private String link;
    private String title;
    private String description;
    private int userId;

    public Link() {
    }

    public Link(long id, String link, String title, String description, int userId) {
        this.id = id;
        this.link = link;
        this.title = title;
        this.description = description;
        this.userId = userId;
    }

    public Link(String link, String title, String description, int userId) {
        this.link = link;
        this.title = title;
        this.description = description;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
