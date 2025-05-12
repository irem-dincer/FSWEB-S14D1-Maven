package com.workintech.cylinder;


public class Cylinder extends  Circle{

    private double height;

public Cylinder(double radius,double height){
    super(radius);// radius instance i parent'tan cagirma.
    //height kontrolu
    if(this.height<0){
        this.height=0;
    }
    else {
        this.height=height;
    }

}
public double getHeight(){
    return  this.height;
}
public double getVolume(){

  return getArea()* height; //getArea Circle class'inda public olarak tanimlandigi icin direkt cagirdim.
}


}
