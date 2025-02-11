package com.java.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

     BoxWeight(BoxWeight other) {    //Box old = other
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }


    public BoxWeight(double l, double h, double w, double weight) {
        // use to initialise values present in parent class
        super(l, h, w);  //what is this? Ans : call the parent class constructor
        // System.out.println(super.weight);  // super isliye ki yaha weight nhi box class the weight access kr shke
        this.weight = weight;
    }
}
