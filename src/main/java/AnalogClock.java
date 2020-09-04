import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDeg = scanner.nextInt();

        /*
         *  your code goes here
         */
        final int DEG_PER_MIN = 6;
        int currentMin;
        int minDeg;

        currentMin = hourDeg * 2;
        minDeg = (currentMin % 60) * DEG_PER_MIN;

        System.out.println(minDeg);
        // closing the scanner object
        scanner.close();
    }
}