package com.paychex.timeclock;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee {

	private int id;
    private ArrayList<Shift> shifts = new ArrayList<Shift>();
    public Employee()
    {

    }

    public Employee(int _id)
    {
        id = _id;
    }

    public Employee(Employee employee) {
    }

    public final void startShift()
    {
        if (shifts.size() == 0 || shifts.get(shifts.size() - 1).getShiftState() == ShiftState.Completed)
        {
            Shift newShift = new Shift();
            shifts.add(newShift);
        }
        else
        {
            throw new IllegalArgumentException("A shift is already in progress");
        }
    }

    public final void endShift()
    {
        if (shifts.size() == 0 || shifts.get(shifts.size() - 1).getShiftState() == ShiftState.Completed)
        {
            throw new IllegalArgumentException("No shift in progress");
        }
        else
        {
            shifts.get(shifts.size() - 1).setShiftState(ShiftState.Completed);
            shifts.get(shifts.size() - 1).setEndTime();
        }
    }

    public final void printDetails()
    {
        System.out.print("Employee Id ");
        System.out.print(id);
        System.out.print("\n");
        if (shifts.size() == 0)
        {
            System.out.print("No shifts for this Employee");
            System.out.print("\n");
        }
        for (int i = 0; i < shifts.size(); i++)
        {
            shifts.get(i).printDetails();
        }
    }

}
