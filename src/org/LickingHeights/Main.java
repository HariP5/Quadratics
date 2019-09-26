package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //todo declare variable a,b,c,discriminant, axisOfSymmetry,parabolaFacing x,y
    double a,b,c,discriminant,axisOfSymmetry,x,y;
    String parabolaFacing;
    Scanner rader;
    //todo initialize manually
    rader = new Scanner(System.in);
    System.out.println("Give me an A");
    a = rader.nextDouble();
    System.out.println("Give me a B");
    b = rader.nextDouble();
    System.out.println("Give me a C");
    c = rader.nextDouble();
//    a=5;
//    b=3;
//    c=1;
    //todo calculation
    axisOfSymmetry = -b/(2*a);
    discriminant = (b*b)-4*(a*c);
    if(discriminant >0) {
        System.out.println("There are two real solutions");
    }
    else if(discriminant ==0){
        System.out.println("There is one real solutions");
    }
    else{
        System.out.println("There are NO real solutions");
    }
    //todo print results
    System.out.println("Axis of symmetry: "+axisOfSymmetry);
    System.out.println("discriminant: "+discriminant);

    // todo initialize scanner and redo the initialize area


        // todo double check results



















    }
}
