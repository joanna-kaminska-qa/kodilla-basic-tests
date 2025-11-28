package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LawyerTest {

    @Test
    void testDescribeJob() {
        // Given
        Lawyer lawyer = new Lawyer();

        // Redirect system output to capture the printed text
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save original System.out
        System.setOut(new PrintStream(outputStream)); // Redirect output

        // When
        lawyer.describeJob(); // Call method that prints to the console

        // Then
        String output = outputStream.toString();
        assertTrue(output.contains("Lawyer's main responsibility is to"));
        assertTrue(output.contains("Their average salary is:"));

        // Restore original System.out
        System.setOut(originalOut);
    }
}
