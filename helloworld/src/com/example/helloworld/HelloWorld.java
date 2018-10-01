package com.example.helloworld;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class HelloWorld {
    public float squareRoot(int x){
        float a=x;
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x, y, z;
        x = 10;
        y = 11;
        z = x * y;
        System.out.println(z);
        x = 5;
        //
        // Problem Set #1
        System.out.println("Problem Set #1:");
        //Q1
        double temprature = 75.6;
        char grade = 'A';
        String name = "Adam";
        System.out.println(name);
        //Q2
        double register = 10.0;
        register = register + 5;
        register = register - 2.5;
        register = register + 10;
        register = register - 3;
        System.out.println(register);
        //Q3
        int backBalance = 500;
        backBalance = backBalance + 250;
        backBalance = backBalance - 100;
        System.out.println(backBalance);
        //Q4
        System.out.println(2.0 * (5/2));
        //Q5
        int day = 9;
        String month = "June";
        //Q6
        String firstName = "Yakov";
        String lastName = "Avshalom";
        String fullName = firstName + " " + lastName;
        int lettersInName = firstName.length() + lastName.length();
        System.out.println("Hello, my name is " + fullName);
        System.out.println("There are " + lettersInName + " letters in my name");
        //Q7
        double fahrenheit = 100.0;
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);
        //
        //Problem set #2
        System.out.println("Problem Set #2:");
        //Q1
        double balance = 0;
        balance = balance + 20;
        balance = balance - 25;
        balance = balance + 30;
        balance = balance - 25;
        if (balance < 0) {
            System.out.println("We're in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit");
        } else {
            System.out.println("We broke even!");
        }
        //Q2
        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1 ) {
                System.out.println("Dog Lover");
            } else {
                System.out.println("Dog person");
            }
        } else if ( cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat Lover");
            } else {
                System.out.println("Cat Person");
            }
            System.out.println("Meow!");
        } else if ( cats > 0 && dogs > 0 ) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (cats == dogs) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What? Don't you like pets?");
        }
        //Q3
        boolean canSeePlayer = true;
        boolean playerPoweredUp = false;
        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run Away!");
            }
        } else {
            System.out.println("Wonder");
        }
        //Q4
        boolean isSnowing = false;
        boolean isRaining = true;
        //double temprature;
        temprature = 60.0;
        if ( isSnowing || isRaining || temprature < 50 ) {
            System.out.println("Let's Stay Home!");
        } else {
            System.out.println("Let's go Out!");
        }
        //Q5
        double time = 18;
        String timeOfDay;
        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if ( time >= 12 && time < 20 ) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }
        System.out.println(timeOfDay);
        //Q6
        int dayOfTheWeek;
        int weekDay = 5;
        boolean holiday = false;
        // Solution from site
        if ( weekDay >= 1 && weekDay <= 6 && !holiday ) {
            System.out.println("Wake Up at 7:00");
        } else {
            System.out.println("Sleep In!");
        }
        // my solution
        if ( holiday || weekDay == 6 || weekDay ==7 ) {
            System.out.println("Sleep In!");
        } else {
            System.out.println("Wake up at 7:00");
        }
        //Q7
        //Assume this can have any value from 1 to 7:
        int dayOfWeek = 1;
        String schedule;
        //TODO: write a switch statement that give schedule a different
        //value for each day of the week based on the dayOfWeek variable.
        //Don’t forget to "break" after each case, and don’t forget to
        //provide a default case!
        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning!";
                break;
            case 2:
                schedule = "Class after work!";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work from home";
                break;
            case 5:
                schedule = "Game night after work";
                break;
            case 6:
            case 7:
            default:
                schedule = "Free";
                break;
        }
        System.out.println("Schedule for today is: " + schedule);
        //Ticket Price
        int ticketPrice = 10;
        int ticketDiscount = 5;
        boolean isStudent = true;
        int age = 20;
        if ( isStudent || age <= 15 || age > 60 ) {
            ticketPrice = ticketPrice - ticketDiscount;
        }
        System.out.println("Ticket Price: " + ticketPrice);
        //Coffee machine
        int passCode=555;
        String coffeeType;
        switch (passCode) {
            case 555: coffeeType = "Espresso";
            break;
            case 312: coffeeType = "Vanilla Latte";
            break;
            case 629: coffeeType = "Drip Coffee";
            break;
            default: coffeeType = "Unkown";
            break;
        }
        System.out.println(coffeeType);
        //Switch Case for month of the year
        int monthInt = 6;
        String monthString;
        switch (monthInt) {
            case 1: monthString = "Januray";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "FAULT!";
                break;
        }
        System.out.println(monthString);

        //
        // Problem Set #1
        //Q1

    }
}
