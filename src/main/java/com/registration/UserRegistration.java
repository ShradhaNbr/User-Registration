package com.registration;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //Method to check if first name and last name is valid or not
    public static boolean validateName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (name.isEmpty())
            return false;
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    //Method to check if email is valid or not
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //Method to check if phone number is valid or not
    public static boolean validateMobileNumber(String phoneNumber) {
        String regex = ("^(91)[0-9]{10}");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    /*
    *Purpose :Method to check if password is valid or not
    * password should have minimum 8 characters
    * Atleast 1 upper case letter
    * Atleast 1 numeric digit
    * Atleast 1 special character
     */
    private boolean validatePassword(String password) {
        String regex = ("(?=.*[a-z])(?=.*[A-Z]).(?=.*[0-9]).(?=.*[@#$%^&-+=()]).{8,}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
//Method to check whether the email samples are valid or not
    public static void email() {
        // Array list to store all sample emails.
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        String regexEmail = "^[0-9A-Za-z]+(([._+-])[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,3}.([a-z]{2,3})*$";
        Pattern pattern = Pattern.compile(regexEmail);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
    }

    //Method to take the input from the user
        public void validateUserDetails () {
            Scanner sc = new Scanner(System.in);
            userDetails details = new userDetails();
            UserRegistration registration = new UserRegistration();
            System.out.println("Enter first name");
            details.setFirstName(sc.next());
            boolean first = registration.validateName(details.getFirstName());
            if (first)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("Enter last name");
            details.setLastName(sc.next());
            boolean last = registration.validateName(details.getLastName());
            if (last)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("Enter email id");
            details.setEmail(sc.next());
            boolean email = registration.validateEmail(details.getEmail());
            if (email)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("Enter mobile number");
            details.setMobileNumber(sc.next());
            boolean mobileNumber = registration.validateMobileNumber(details.getMobileNumber());
            if (mobileNumber)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("Enter password");
            details.setPassword(sc.next());
            boolean password = registration.validatePassword(details.getPassword());
            if (password)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            sc.close();
        }


}
