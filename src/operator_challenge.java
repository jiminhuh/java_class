public class operator_challenge {
    public static void main(String[] args) {
        double doubleVariable = 20.00d;
        double secondDouble = 80.00d;
        double myTotal = (doubleVariable + secondDouble) * 100d;
        double myRemainder = (double) (myTotal % 40.00);
        boolean isZero;

        if (myRemainder == 0) {
            isZero = true;
        } else {
            isZero = false;
        }



        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }

        String name = "Jimins";
        if (name.contains("s")) {
            System.out.println("Name contains letter S");
        }
    }
}
