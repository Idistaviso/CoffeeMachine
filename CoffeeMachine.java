package machine;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        final int CONST_WATER = 200;
        final int CONST_MILK = 50;
        final int CONST_COFFEE_BEANS = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int newWater = water / CONST_WATER;
        int newMilk = milk / CONST_MILK;
        int newCoffeeBeans = coffeeBeans / CONST_COFFEE_BEANS;

        int minCups = newWater;

        if (newMilk <= minCups)
            minCups = newMilk;
        if (newCoffeeBeans <= minCups)
            minCups = newCoffeeBeans;

        int extraCups = minCups - cups;

        if (cups == minCups)
            System.out.println("Yes, I can make that amount of coffee");
        else if (minCups > cups)
            System.out.println("Yes, I can make that amount of coffee (and even " + extraCups + "more than that)");
        else
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");


    }
}

