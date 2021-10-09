package com.programowanieNarz;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Podaj swoje imię: ");
    String name = scan.nextLine();

    System.out.println("Hello " + name);
    }
}
