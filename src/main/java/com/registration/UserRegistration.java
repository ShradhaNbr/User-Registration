package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (firstName.isEmpty())
            return false;
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public void validateUserDetails() {
        Scanner sc = new Scanner(System.in);
        userDetails details = new userDetails();
        UserRegistration registration = new UserRegistration();
        System.out.println("Enter first name");
        details.setfirstName(sc.next());
        boolean flag = registration.validateFirstName(details.getFirstName());
        if (flag)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        sc.close();
    }
}
