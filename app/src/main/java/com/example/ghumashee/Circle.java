package com.example.ghumashee;

public class Circle extends Shape {
    public double rad;
    public Circle(String name, double rad){
        super(name);
        this.rad=rad;
    }

    @Override
    public double area() {
        return  Math.PI * rad *rad;
    }

    @Override
    public double parimeter() {
        return 2 * Math.PI * rad;
    }
}
