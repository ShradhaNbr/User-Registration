package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (name.isEmpty())
            return false;
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public void validateUserDetails() {
        Scanner sc = new Scanner(System.in);
        userDetails details = new userDetails();
        UserRegistration registration = new UserRegistration();
        System.out.println("Enter first name");
        details.setFirstName(sc.next());
        boolean first = registration.validateFirstName(details.getFirstName());
        if (first)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        System.out.println("Enter last name");
        details.setFirstName(sc.next());
        boolean last = registration.validateFirstName(details.getFirstName());
        if (last)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        sc.close();
    }
}
