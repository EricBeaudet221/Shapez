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
public class Triangle {

    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }
    public double setHeight(){
        this.height = height;
        return 0;
    }
    public double setBase(){
        this.base = base;
        return 0;
    }
    
    

}
