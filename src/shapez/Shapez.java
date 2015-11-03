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
public class Shapez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testShapes();
        testRectangle();

    }

    private static void testShapes() {
        Circle myCircle = new Circle(5.5);
//        myCircle.setRadius(5.5);

        System.out.println("   Circle");
        System.out.printf("   radius   = %.2f \n", myCircle.getRadius());
        System.out.printf("   area      = %.2f \n", myCircle.getArea());
        System.out.printf("   circumference    = %.2f \n", myCircle.getCircumference());
        System.out.printf("   diameter    = %.2f \n", myCircle.getDiameter());

    }

    private static void testRectangle() {
        Rectangle myRectangle = new Rectangle(3, 5);
//        myRectangle.setLength(42.7);
//        myRectangle.setWidth(37.2);
        
        System.out.println("   Rectangle ");
        System.out.printf("   lenght  = %.2f \n", myRectangle.getLenght());
        System.out.printf("   width  = %.2f \n", myRectangle.getWidth());
        System.out.printf("  perimeter  = %.2f \n", myRectangle.getPerimeter());
        System.out.printf("  area  = %.2f \n", myRectangle.getArea());
        
    }

}
