package com.example.model;

public class Cell {
    private int x;
    private int y;
    private String value;

    public Cell(int x, int y, String value){
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getValue(){
        return value;
    }
}
