/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author MOKLET-2
 */
public class Shape {
    private String color;
    //Constructor
    public Shape(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    public double getArea(){
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
