package com.epam.rd.autotasks.meetanagent;

import java.io.IOException;
import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
