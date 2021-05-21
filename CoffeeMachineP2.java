package machine;
import java.util.Scanner;

public class CoffeeMachineP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordered = true;
        boolean increase = true;
        int numberTwo = 0; 
        int numberOne = 0;
        int numberPrew = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (numberOne == 0 || numberTwo == 0) {
                if (numberOne == 0) {
                    numberOne = number;
                } else if (numberTwo == 0 && numberOne != number) {
                    numberTwo = number;
                    increase = numberOne < numberTwo;
                }
            } else {
                if (ordered) {
                    if (increase) {
                        if (numberPrew > number) {
                            ordered = false;
                        }
                    } else {
                        if (numberPrew < number) {
                            ordered = false;
                        }
                    }
                }
            }
            numberPrew = number;
        }

        System.out.println(ordered);
    }
}
