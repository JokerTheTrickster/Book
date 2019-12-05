package com.pokemon.book.bean;

public class Page extends BasicBean{

    private String id;

    private String name;

    private String mainProperty;

    private String subProperty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainProperty() {
        return mainProperty;
    }

    public void setMainProperty(String mainProperty) {
        this.mainProperty = mainProperty;
    }

    public String getSubProperty() {
        return subProperty;
    }

    public void setSubProperty(String subProperty) {
        this.subProperty = subProperty;
    }
}
