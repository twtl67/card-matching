package model;

public class PhotoCard {

    public String photo_path;
    String name;
    NameCard matching_nc;

    //CONSTRUCTOR
    public PhotoCard(String name, String photo_path) {
        this.name = name;
        this.photo_path = photo_path;
        matching_nc = new NameCard(name);
    }

    public void changeName(String new_name) {
        name = new_name;
    }

    public void changePhoto(String new_photo_path) {
        photo_path = new_photo_path;
    }
}
