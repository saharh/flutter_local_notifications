package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;

@Keep
public class PersonDetails {
    public Boolean bot;
    public String icon;
    public IconSource iconBitmapSource;
    public Boolean contactIconHighRes;
    public Boolean important;
    public String key;
    public String name;
    public String uri;

    public PersonDetails(Boolean bot, String icon, IconSource iconSource, Boolean important, String key, String name, String uri, Boolean contactIconHighRes) {
        this.bot = bot;
        this.icon = icon;
        this.iconBitmapSource = iconSource;
        this.contactIconHighRes = contactIconHighRes;
        this.important = important;
        this.key = key;
        this.name = name;
        this.uri = uri;
    }
}
