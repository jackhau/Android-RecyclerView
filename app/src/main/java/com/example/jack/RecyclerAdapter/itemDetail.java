package com.example.jack.RecyclerAdapter;

/**
 * Created by Jack on 13/11/2017.
 */

public class itemDetail {
    private String image;
    private String name;
    private String age;

    public itemDetail(String image, String name, String age) {
        this.image = image;
        this.name = name;
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
