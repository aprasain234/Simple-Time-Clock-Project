package com.paychex.timeclock;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeTimeManagementApp {
	private TreeMap<Integer, Employee > employees = new TreeMap<Integer, Employee >();

    public final void addEmployee(int employeeId)
    {
        if (employees.containsKey(employeeId))
        {
            throw new IllegalArgumentException("employee id is already taken");
        }

        Employee emp = new Employee(employeeId);
        employees.put(employeeId, emp);
    }

    public final Employee getEmployee(int employeeId)
    {
        if (!employees.containsKey(employeeId))
        {
            throw new IllegalArgumentException("No employee with such id");
        }
        else
        {
     return employees.get(employeeId);
        }
    }

    public final void startShift(int employeeId)
    {
        getEmployee(employeeId).startShift();
    }

    public final void endShift(int employeeId)
    {
        getEmployee(employeeId).endShift();
    }

    public final void printAllShiftDetails()
    {

        Set<Map.Entry<Integer, Employee> > entries
                = employees.entrySet();

        // Way 1
        // Using for loops
        for (Map.Entry<Integer, Employee> entry : entries) {
            System.out.println(entry.getKey() + "->"
                    + entry.getValue());
            Employee employee = employees.get(entry.getKey());
            employee.printDetails();
        }
   /*     for (int i = employees.; i != employees.end(); i++)
        {
            i.second.printDetails();
        } */
    }

}

