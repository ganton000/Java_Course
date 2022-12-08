public class FirstClass {

    public static double add(double num1, double num2, double multiplier) {
        double result = (num1 + num2)*multiplier;
        return result;
    }

    public static double get_remainder(double value, double modulo) {
        double remainder = value % modulo;
        return remainder;
    }
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double multiplier = 100d;
        double modulo = 40.00d;

        double value = add(firstValue, secondValue, multiplier);
        double remainder = get_remainder(value, modulo);

        boolean isDivisible = (remainder == 0.0);

        System.out.println("The sum of " + firstValue + " and " + secondValue + " times " + multiplier + " is " + value);
        System.out.println(value + " modulo " + modulo + " has a remainder of " + remainder);

        if (isDivisible) {
            System.out.println("Therefore " + value + " is divisible by " + modulo + "!");
        } else {
            System.out.println("Therefore " + value + "is NOT divisible by " + modulo + "!");
        }



    }
}
