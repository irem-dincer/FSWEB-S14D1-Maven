package com.workintech.cylinder;

public class Circle {

   private double radius;

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return  this.radius * this.radius * Math.PI;
    }

    public Circle(double radius){
       if(this.radius<0){
           this.radius=0;
       }
       else{
          this.radius=radius;
       }
   }

}
