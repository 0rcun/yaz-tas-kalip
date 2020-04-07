package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class CustomRequest {
    private static CustomRequest mInstance;

    private CustomRequest() {

    }
    public static synchronized CustomRequest getInstance() {
        if (mInstance == null) {
            mInstance = new CustomRequest();
        }
        return mInstance;
    }

    public Image getImage(String dest) throws IOException {
        Image image = null;
        URL url = new URL(dest);
        image = ImageIO.read(url);
        return image;
    }
}
