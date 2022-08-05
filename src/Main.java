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
*/
                /*/
        int a;
        int b;
        a=10;
        b=2;
        int c;
        c=a-b;
        System.out.println(c);


        Calculator calc = new Calculator();
        calc.summary(5, 2);
        System.out.println("The result of summary is: " + calc.summary(5, 2));

        calc.subtraction(9, 4);
        System.out.println("The result of subtraction is: " + calc.subtraction(9, 4));

        calc.multiplication(4, 3);
        System.out.println("The result of multiplication is: " + calc.multiplication(4, 3));

        calc.division(8, 4);
        System.out.println("The result of division is: " + calc.division(8, 4));
*/
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
    }
}
