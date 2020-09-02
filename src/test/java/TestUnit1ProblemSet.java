import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestUnit1ProblemSet {

    @Test
    public void testSecondsPastMidnight1()
    {
        String input = "7500";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        SecondsPastMidnight.main(args);

        //expected output
        String consoleOutput = "2 125";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testSecondsPastMidnight2()
    {
        String input = "8000";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        SecondsPastMidnight.main(args);

        //expected output
        String consoleOutput = "2 133";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testSecondsPastMidnight3()
    {
        String input = "59";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        SecondsPastMidnight.main(args);

        //expected output
        String consoleOutput = "0 0";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testSecondsPastMidnight4()
    {
        String input = "12345";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        SecondsPastMidnight.main(args);

        //expected output
        String consoleOutput = "3 205";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testSecondsPastMidnight5()
    {
        String input = "86010";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        SecondsPastMidnight.main(args);

        //expected output
        String consoleOutput = "23 1433";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testTimestamps1()
    {
        String input = "1\n1\n1\n2\n2\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        Timestamps.main(args);

        //expected output
        String consoleOutput = "3661";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testTimestamps2()
    {
        String input = "6\n54\n4\n14\n18\n42\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        Timestamps.main(args);

        //expected output
        String consoleOutput = "26678";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testTimestamps3()
    {
        String input = "1\n49\n28\n14\n7\n55\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        Timestamps.main(args);

        //expected output
        String consoleOutput = "44307";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testTimestamps4()
    {
        String input = "4\n16\n9\n12\n6\n7\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        Timestamps.main(args);

        //expected output
        String consoleOutput = "28198";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testTimestamps5()
    {
        String input = "5\n13\n38\n5\n13\n38\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        Timestamps.main(args);

        //expected output
        String consoleOutput = "0";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testStudentDesks1()
    {
        String input = "20\n21\n22\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        StudentDesks.main(args);

        //expected output
        String consoleOutput = "32";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testStudentDesks2()
    {
        String input = "1\n1\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        StudentDesks.main(args);

        //expected output
        String consoleOutput = "3";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testStudentDesks3()
    {
        String input = "26\n20\n16\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        StudentDesks.main(args);

        //expected output
        String consoleOutput = "31";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testStudentDesks4()
    {
        String input = "25\n21\n23\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        StudentDesks.main(args);

        //expected output
        String consoleOutput = "36";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testStudentDesks5()
    {
        String input = "17\n19\n18\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        StudentDesks.main(args);

        //expected output
        String consoleOutput = "28";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testAnalogClock1()
    {
        String input = "5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        AnalogClock.main(args);

        //expected output
        String consoleOutput = "60";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testAnalogClock2()
    {
        String input = "31";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        AnalogClock.main(args);

        //expected output
        String consoleOutput = "12";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testAnalogClock3()
    {
        String input = "59";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        AnalogClock.main(args);

        //expected output
        String consoleOutput = "348";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testAnalogClock4()
    {
        String input = "1";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        AnalogClock.main(args);

        //expected output
        String consoleOutput = "12";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testAnalogClock5()
    {
        String input = "40";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main
        String[] args = {};
        AnalogClock.main(args);

        //expected output
        String consoleOutput = "120";

        // assertion
        assertEquals(consoleOutput, out.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}