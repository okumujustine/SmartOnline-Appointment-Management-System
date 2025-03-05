package com.justine;

import com.justine.model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var welcomeMessage = "Welcome to cs425 Cty Library \n";
        System.out.println("Hello world!");

        var publishers = List.of(
                new Publisher(101, "Justine", "justine @gmail.com","1234", "781459239"),
                new Publisher(102, "Sunday", "sunday@gmail.com", "1234", "7814569230"),
                new Publisher(103, "Emmy", "emmy@gmail.com", "1234", "7814569231")
        );

        publishers.forEach(System.out::println);
    }
}