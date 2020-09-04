import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        int hourDif;
        int minDif;
        int secDif;
        int totalSecs;
        
        hourDif = hours2 - hours1;
        minDif = minutes2 - minutes1;
        secDif = seconds2 - seconds1;

        hourDif = (hourDif * 60) * 60;
        minDif = minDif * 60;

        totalSecs = secDif + minDif + hourDif;
        System.out.println(totalSecs);
        // closing the scanner object
        scanner.close();
    }
}