package com.br.mauroandremazzola.bragancatechday2017.data.entities;

/**
 * Created by mauroandremazzola on 19/05/17.
 */

public class Partner {

    //region FIELDS
    private int id;
    private String name;
    private String site;
    private int resIdImage;
    //endregion

    //region CONSTRUCT
    public Partner(int id, String name, String site, int resIdImage) {
        this.id = id;
        this.name = name;
        this.site = site;
        this.resIdImage = resIdImage;
    }
    //endregion

    //region PROPERTIES
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getResIdImage() {
        return resIdImage;
    }

    public void setResIdImage(int resIdImage) {
        this.resIdImage = resIdImage;
    }
    //endregion

}
