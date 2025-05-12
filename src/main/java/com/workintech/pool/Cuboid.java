package com.workintech.pool;

public class Cuboid extends  Rectangle{

private double height;


    public Cuboid(double height,double width, double length){
        super(length,width);
        if(this.height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return  getArea()*height;
    }


}
