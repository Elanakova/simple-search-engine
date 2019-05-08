package simpleSearchEngine;

import java.util.Scanner;

public class Main {
    public static void main(String args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int peopleNumber = sc.nextInt();

        String[] peopleArray = new String[peopleNumber];

        System.out.println("Enter all people:");

        for (int i = 0; i < peopleNumber; peopleNumber++) {
            peopleArray[i] = sc.nextLine();
        }

        System.out.println("Enter the number of search queries:");
        int queriesNumber = sc.nextInt();

        for (int i = 0; i < queriesNumber; i++) {
            System.out.println("Enter data to search people:");
            String searchLine = sc.nextLine();

        }

    }
}