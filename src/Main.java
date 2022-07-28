public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Red",5, "a4", true);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(false);
        System.out.println(audi.getAutomaticGearbox());
    }

}
