package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gallons: ");
        double gallons = input.nextDouble();
        System.out.println("Litres: "+gallons*3.7854);

        System.out.print("Kilos on Earth: ");
        double kilos = input.nextDouble();
        System.out.println("Kilos on the Moon: "+kilos*0.17);

        System.out.print("Circle radius: ");
        double radius = input.nextDouble();
        System.out.println("Circle circumference: "+2*Math.PI*radius);
        System.out.println("Circle area: "+Math.PI*Math.pow(radius,2));
    }
}
