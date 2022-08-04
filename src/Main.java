import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
        Car mini = new Car("White", 3,"Cooper S",true);
        System.out.println("Your car is " + mini.getBrand() + " and have " + mini.getDoorsAmount() + " doors. "+ "Your's color of the car is " +   mini.getColour() + ". Automatic gearbox: " + mini.getAutomaticGearbox());
    }

}
 */
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