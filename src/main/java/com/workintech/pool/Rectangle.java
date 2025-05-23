package com.workintech.pool;
public class Rectangle {

    private  double width;
    private double length;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public void setLength(double length) {
    if(this.length<0){
        this.length=0;
    }
    else {
        this.length=length;
    }
    }
    public void setWidth(double width) {
        if (this.width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
}
