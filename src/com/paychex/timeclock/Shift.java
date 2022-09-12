
package com.paychex.timeclock;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

enum ShiftState {
	Inprogess, Completed;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue() {
		return this.ordinal();
	}

	public static ShiftState forValue(int value) {
		return values()[value];
	}
}

public class Shift {

	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private ShiftState state;

	public Shift() {
		startTime = LocalDateTime.now();
		state = ShiftState.Inprogess;
	}

	public final ShiftState getShiftState() {
		return state;
	}

	public final void setShiftState(ShiftState _state) {
		state = _state;
	}

	public final void setEndTime() {
		endTime = LocalDateTime.now();
	}

	public final void printDetails() {
		String st = state == ShiftState.Inprogess ? "Inprogess" : "Completed";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS");

		if (state == ShiftState.Inprogess) {
			System.out.print("start time ");
			System.out.print(startTime.format(formatter));
			System.out.print(" state ");
			System.out.print(st);
			System.out.print("\n");
		} else {
			System.out.print("start time ");
			System.out.print(startTime.format(formatter));
			System.out.print(" end time ");
			System.out.print(endTime.format(formatter));
			System.out.print(" state ");
			System.out.print(st);
			System.out.print("\n");
		}

	}
}
