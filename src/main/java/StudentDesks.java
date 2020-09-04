import java.util.Scanner;

class StudentDesks {


    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int numStudentsA = scanner.nextInt();
        int numStudentsB = scanner.nextInt();
        int numStudentsC = scanner.nextInt();

        /*
         *  your code goes here
         */
        final int DESK_CAPACITY = 2;
        int deskTotal = 0;
        deskTotal += deskNeed(numStudentsA, DESK_CAPACITY);
        deskTotal += deskNeed(numStudentsB, DESK_CAPACITY);
        deskTotal += deskNeed(numStudentsC, DESK_CAPACITY);

        System.out.println(deskTotal);
        // closing the scanner object
        scanner.close();
    }

     //Takes students and desks then divides. It will return a rounded up int value of the result.
     //Is this bad? I can't recall the rules for declaring functions and calling them fully.
    private static int deskNeed(double students, double deskCap)
    {
      return (int) Math.ceil(students / deskCap);
    }
}