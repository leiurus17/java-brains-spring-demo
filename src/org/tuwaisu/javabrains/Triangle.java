package org.tuwaisu.javabrains;

public class Triangle {

    private String type;

    public Triangle() {

    }

    public Triangle(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(getType() + " triangle drawn");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
