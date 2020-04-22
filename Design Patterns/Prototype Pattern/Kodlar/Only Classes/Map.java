package com.company;

import java.awt.*;

public class Map {
    private String name;
    private Image appearance;

    public Map(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getAppearance() {
        return appearance;
    }

    public void setAppearance(Image appearance) {
        this.appearance = appearance;
    }
}
