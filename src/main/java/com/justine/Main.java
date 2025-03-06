package com.justine;

import com.justine.model.Patient;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var welcomeMessage = "Welcome to SmartOnline Appointment Management System \n";
        System.out.println(welcomeMessage);

        var publishers = List.of(
                new Patient(101, "Justine", "justine @gmail.com",24, "1234", "781459239"),
                new Patient(102, "Sunday", "sunday@gmail.com", 29, "1234", "7814569230"),
                new Patient(103, "Emmy", "emmy@gmail.com", 33, "1234", "7814569231")
        );

        publishers.forEach(System.out::println);
    }
}