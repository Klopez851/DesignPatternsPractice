package kl.practice.Structural.Decorator;

/*
 * ============================================================
 * 4. DECORATOR — Coffee Shop
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * Create:
 *
 *     Coffee
 *
 * with:
 *
 *     getDescription()
 *     getCost()
 *
 * Basic coffee costs $3.00.
 *
 * Add optional toppings:
 *
 *     Milk            +$0.50
 *     Mocha           +$0.75
 *     WhippedCream    +$0.80
 *
 * The customer should be able to dynamically combine toppings.
 *
 * Example:
 *
 *     Coffee + Milk + Mocha
 *
 * Result:
 *
 *     Coffee, Milk, Mocha
 *     $4.25
 *
 * Do NOT create classes for every combination.
 *
 *
 * FOLLOW-UP
 *
 * Add these new decorators:
 *
 *     SoyMilk         +$0.60
 *     Caramel         +$0.70
 *
 * Existing coffee code should not need to be modified.
 *
 * Then support this:
 *
 *     Coffee
 *       + Milk
 *       + Mocha
 *       + Caramel
 *       + WhippedCream
 *
 * Finally:
 *
 * Create two different coffee orders using the same base
 * Coffee object.
 *
 * Ask yourself:
 *
 *     Are you modifying the original Coffee?
 *
 *     What happens if the decorators are applied in a different
 *     order?
 *
 * ============================================================
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new CoffeeImpl("Coffee", 3.00);
        boolean milk, mocha, whippedCream, soyMilk, caramel;

        System.out.println(coffee);

        System.out.println("milk? true/false: ");
        milk = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("soy milk? true/false: ");
        soyMilk = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Mocha? true/false: ");
        mocha = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Whipped cream? true/false: ");
        whippedCream = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Caramel? true/false: ");
        caramel = Boolean.parseBoolean(scanner.nextLine());



        if(milk){
            coffee = new MilkDecorator(coffee);
        }

        if(soyMilk){
            coffee = new SoyMilkDecorator(coffee);
        }

        if(mocha){
            coffee = new MochaDecorator(coffee);
        }

        if (whippedCream){
            coffee = new WhippedCreamDecorator(coffee);
        }

        if(caramel){
            coffee = new CaramelDecorator(coffee);
        }

        System.out.println("ur total is: " + coffee.getCost()+ " for a "+coffee.toString());
    }
}
