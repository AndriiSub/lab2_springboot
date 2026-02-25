package com.exampletolr.lr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Lr1Application implements CommandLineRunner {

    private final MathService mathService;

    @Autowired
    public Lr1Application(MathService mathService) {
        this.mathService = mathService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Lr1Application.class, args);
    }

    @Override
    public void run(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        double base = scanner.nextDouble();

        System.out.print("Enter the degree: ");
        int exponent = scanner.nextInt();

        double result = mathService.calculatePower(base, exponent);

        System.out.println("Result:");
        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }
}