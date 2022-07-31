package com.example.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Yk implements Serializable {

    private int id;

    private String name;

    private int sex;

    private String img;

    private static final long serialVersionUID = 1L;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Yk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", img='" + img + '\'' +
                '}';
    }
}
