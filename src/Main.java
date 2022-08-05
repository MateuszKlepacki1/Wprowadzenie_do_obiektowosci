import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Car mini = new Car("White", 3,"Cooper S",true);
        System.out.println("Your car is " + mini.getBrand() + " and have " + mini.getDoorsAmount() + " doors. "+ "Your's color of the car is " +   mini.getColour() + ". Automatic gearbox: " + mini.getAutomaticGearbox());
    }

}

        System.out.println("Choose color of your car");
        Scanner Colour = new Scanner(System.in);
        String newColour = Colour.next();
        System.out.println("How many doors you want?");
        Scanner doorsAmount = new Scanner(System.in);
        int newDoorsAmount = doorsAmount.nextInt();
        System.out.println("Whats brand?");
        Scanner Brand = new Scanner(System.in);
        String newBrand = Brand.next();
        System.out.println("Does car have automatic gearbox? true-yes / false-no");
        Scanner automaticGearbox = new Scanner(System.in);
        boolean newAutomaticGearbox = automaticGearbox.nextBoolean();

        Car Mini=  new Car(newColour, newDoorsAmount,newBrand,newAutomaticGearbox);
        System.out.println("So Your car will be: "+ Mini.getBrand()+ " . Color of your car is: " + Mini.getColour() + ". Your "+ Mini.getBrand()+ " will have " + Mini.getDoorsAmount() + " doors. Also, You will have an gerabox (True - you have an automatic gearbox / False - youhave manual gearbox): "+ Mini.getAutomaticGearbox() + ".");
    }
}
____________________________________________________________________

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number: ");
        int firstVariable = scanner.nextInt();
        System.out.println("Give second number: ");
        int secondVariable = scanner.nextInt();
        System.out.println("The summary result is: " + calc.summary(firstVariable, secondVariable));
        System.out.println("The subtraction result is: " + calc.subtraction(firstVariable,secondVariable));
        System.out.println("The multiplication result is: " + calc.multiplication(firstVariable,secondVariable));
        System.out.println("The division result is: " + calc.division(firstVariable,secondVariable));
*/
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do? Write correct sign: '/' for division +' for summary , '-' for subtraction, '*' for multiplication");
        String sign = scanner.next();
        System.out.println("Give first number: ");
        int z = scanner.nextInt();
        System.out.println("Give second number: ");
        int c = scanner.nextInt();
        switch (sign) {
            case "+":
                System.out.println("Summary result is: " + calc.summary(z, c));
                break;
            case "-":
                System.out.println("Subtraction result is " + calc.subtraction(z, c));
                break;
            case "*":
                System.out.println("Multiplication result is: " + calc.multiplication(z,c));
                break;
            case "/":
                System.out.println("Division result is: "+calc.division(z,c));
                break;
        }
    }
}

