package com.br.mauroandremazzola.bragancatechday2017.data.entities;

import org.parceler.Parcel;

import java.util.Calendar;

/**
 * Created by Alex on 18/05/2017.
 */
@Parcel
public class Speaker {

    //region FIELDS
    int id;
    String name;
    String description;
    String lecture;
    String urlLinkedin;
    Calendar hour;
    int resIdImage;
    //endregion

    //region CONSTRUCT
    public Speaker() { }

    public Speaker(int id, String name, String urlLinkedin, int resIdImage) {
        this.id = id;
        this.name = name;
        this.urlLinkedin = urlLinkedin;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public Calendar getHour() {
        return hour;
    }

    public void setHour(Calendar hour) {
        this.hour = hour;
    }

    public int getResIdImage() {
        return resIdImage;
    }

    public void setResIdImage(int resIdImage) {
        this.resIdImage = resIdImage;
    }
    //endregion
}
