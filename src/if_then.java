public class if_then {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien.");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        boolean isCar = false;


        boolean wasCar = isCar ? true : false;

        System.out.println(wasCar);

    }
}
