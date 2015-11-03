/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapez;

/**
 *
 * @author ericbeaudet
 */
public class Rectangle {
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    
    
    private double length, width;
    
    public double getLenght(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getPerimeter(){
        return 2 * (length + width);
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    
    
}
