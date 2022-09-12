package com.paychex.timeclock;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Globals {
	public static void printInstructions() {
        System.out.print("Press 1 to add employee");
        System.out.print("\n");
        System.out.print("Press 2 to start shift employee");
        System.out.print("\n");
        System.out.print("Press 3 to end shift");
        System.out.print("\n");
        System.out.print("Press 4 to print all data");
        System.out.print("\n");
        System.out.print("Press 5 to exit");
        System.out.print("\n");

    }

    public static void main(String[] args) {
        EmployeeTimeManagementApp app = new EmployeeTimeManagementApp();

        printInstructions();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your input");
            System.out.print("\n");
            int input;
            input = Integer.parseInt(scanner.nextLine());
            try
{
                if (input == 1) {
                    int empID;
                    System.out.print("Enter Employee ID ");
                    empID = Integer.parseInt(scanner.nextLine());
                    app.addEmployee(empID);
                } else if (input == 2) {
                    int empID;
                    System.out.print("Enter Employee ID ");
                    empID = Integer.parseInt(scanner.nextLine());
                    app.startShift(empID);
                } else if (input == 3) {
                    int empID;
                    System.out.print("Enter Employee ID ");
                    empID = Integer.parseInt(scanner.nextLine());
                    app.endShift(empID);
                } else if (input == 4) {
                    app.printAllShiftDetails();
                } else if (input == 5) {
                    System.out.print("exiting..");
                    System.out.print("\n");
                    break;
                } else {
                    throw new IllegalArgumentException("invalid input");
                }
            }
			catch(RuntimeException e)
            {
                System.out.print("error: ");
                System.out.print(e.getMessage());
                System.out.print("\n");
            }

        }

    }


}
