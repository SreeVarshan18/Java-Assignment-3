package com.harman.assignment3;

import java.util.Scanner;

public class development {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer far,cel;
        System.out.println("Enter Fahrenheit ");
        far = input.nextInt();

        Conversion obj = new Conversion();
        cel = obj.fartocel(far);
        System.out.println(cel);

    }
}
