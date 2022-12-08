public class SecondClass {
    public static void main(String[] args){
        String message = "Hello World!";

        boolean isAlien = true;
        if (isAlien) { System.out.println("It is an alien!"); }

        int topScore = 100;
        int secondTopScore = 81;
        if ((topScore >= 100) && (secondTopScore < topScore)) {
            System.out.println("You have the high score!");
        }
        System.out.println(message);

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (!isDomestic) {
            System.out.println("This car is NOT domestic to our country");
        }

        boolean isNotDomestic = (makeOfCar == "Volkswagen");
        if (!isDomestic) {
            System.out.println("This car is, once again, NOT domestic to our country");
        }
    }
}