package model;

import com.sun.imageio.plugins.jpeg.JPEG;

public class PhotoCard {
    String name;
    JPEG photo;

    //CONSTRUCTOR
    public PhotoCard(String name, JPEG photo) {
        this.name = name;
        this.photo = photo;
    }

    public void changeName(String new_name) {
        name = new_name;
    }

    public void changePhoto(JPEG new_photo) {
        photo = new_photo;
    }
}
