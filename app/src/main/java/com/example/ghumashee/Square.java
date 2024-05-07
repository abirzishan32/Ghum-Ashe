package com.example.ghumashee;

public class Square  extends Shape{
    public double side;
    public Square(String name, double side){
        super(name);
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double parimeter() {
        return 4*side;
    }
}
