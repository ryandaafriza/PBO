package Kasus2;

import java.text.DecimalFormat;

public class PainThings {
   public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        //Instantiate the three shapes to paint
        Rectangle deck = new Rectangle(20, 10);
        Sphere bigBall = new Sphere(5);
        Cylinder tank = new Cylinder(30, 5);

        //Compute the amount of paint needed for each shape
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        //print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed ...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
        

   } 
}
