import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int secInput = scanner.nextInt();

        //Your code goes here
        final int SEC_IN_MIN = 60;
        final int SEC_IN_HOUR = 3600;
        int hourSince = -1;
        int minSince = -1;

        hourSince = secInput / SEC_IN_HOUR;
        minSince = secInput / SEC_IN_MIN;

        System.out.print(hourSince + " " + minSince);

        // closing the scanner object
        scanner.close();
    }
}