package net.newtab.model;

/**
 * Created by Vardan on 12/17/2017.
 */


public class Website {

    private Long id;
    private String name;
    private String title;
    private String url;

    public Website(Long id, String name, String title, String url) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.url = url;
    }

    public Website() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
