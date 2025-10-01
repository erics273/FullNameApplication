package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    //create the scanner to take in user input
    public static Scanner nameScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //this is using System.out.print* to display questions to the user
        System.out.println("Please enter your name");
        System.out.print("First name: ");

        //this is capturing the answer given for the first name question and storing
        //in the firstName variable
        String firstName = nameScanner.nextLine();

        //now we ask for the middle name
        System.out.print("Middle name: ");

        //this is capturing the answer given for the middle name question and storing
        //in the middleInitial variable
        String middleInitial = nameScanner.nextLine();

        //now we ask for the middle name
        System.out.print("Last name: ");

        //this is capturing the answer given for the last name question and storing
        //in the lastName variable
        String lastName = nameScanner.nextLine();

        //now we ask for the middle name
        System.out.print("Suffix: ");

        //this is capturing the answer given for the suffix question and storing
        //in the suffix variable
        String suffix = nameScanner.nextLine();

        //start the full name variable and start it with the first name
        String fullName = firstName;

        //if the middle initial is not empty
        //contact the middle initial
        if( !middleInitial.isBlank() ){
            fullName += " " + middleInitial + " ";
            //long version of the above
           // fullName = fullName + " " + middleInitial + " ";
        }


        //append the last name
        fullName += lastName;

        //if the middle initial is not empty
        //contact the middle initial
        if( !suffix.isEmpty() ){
            fullName += ", " + suffix;
        }

        //display the results
        System.out.println(fullName);


    }

}
