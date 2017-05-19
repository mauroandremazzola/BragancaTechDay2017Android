package com.br.mauroandremazzola.bragancatechday2017.data.entities;

/**
 * Created by Alex on 18/05/2017.
 */
public class Speaker {

    //region FIELDS
    private int id;
    private String name;
    private String email;
    private int resIdImage;
    //endregion

    //region CONSTRUCT
    public Speaker() { }

    public Speaker(int id, String name, String email, int resIdImage) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getResIdImage() {
        return resIdImage;
    }

    public void setResIdImage(int resIdImage) {
        this.resIdImage = resIdImage;
    }
    //endregion
}
