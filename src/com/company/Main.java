package com.company;

public class Main {

    public static void main(String[] args) {
	//Homework 2:
    //1. p(4) = 7 ; p(w) = 3 + 2*(w-2)
    //2. p(11) = 27 ; p(w) = 9 + 3*(w-5)

        int weight = 4;
        int price = 0;

     if (weight <= 2)
         price = 3;
     if (weight > 2 && weight <= 5)
         price = 3 + 2*(weight-2);
     if (weight > 5)
         price = 9 + 3*(weight-5);

     System.out.println(price);

    //Homework 3.
    int a = 2;
    int answer1 = a*a*a;
        System.out.println(answer1);

    /*
    pseudocode:
    A = 2
    ANSWER1 = A * A * A
    output ANSWER1
     */

    int b = 3;
    int answer2 = (int) Math.pow(b,a);

        System.out.println(answer2);

    //Homework 4:
    boolean found = false;
    int n = 0;
    while (!found){
    int remainder = (n*n*n + 91) % 47;

    if (remainder == 0)
        found = true;
    else
        n++;
    }
        System.out.println("The smallest positive value of n that is divisible by 47 is: " + n);

    //Homework 5:
        int found_time = 0; //variable for the final time that will be found
        int greatest_value = 0; //variable for the greatest difference in two hours
    for (int t = 0; t <= 100; t++){ //looping through every hour
        int bacteria = t*(t - 20)*(t - 100) + 120000; //amount of bacteria for current hour
        int previous_bacteria = (t - 1)*((t - 1) - 20)*((t - 1) - 100) + 120000; //amount of bacteria in previous hour
        int difference = bacteria - previous_bacteria; //taking the difference
        if (difference > greatest_value) { //if the difference at time t is greater than the current greatest value
            greatest_value = difference; //then the greatest value will become the current difference
            found_time = t; //and then we update the current time to be t every time it finds a greater difference
        }
    }
        System.out.println("The difference of the bacteria: " + greatest_value + " The time is: " + found_time);
    /*
    pseudocode:
    
    FOUND_TIME = 0
    GREATEST_VALUE = 0;
    for t = 0, t <= 100, t++
    BACTERIA = t*(t - 20)*(t - 100) + 120000
        PREVIOUS_BACTERIA = (t - 1)*((t - 1) - 20)*((t - 1) - 100) + 120000
        DIFFERENCE = BACTERIA - PREVIOUS_BACTERIA

        if DIFFERENCE > greatest_value then
            greatest_value = DIFFERENCE
            FOUND_TIME = t
        end if

    end for

    output FOUND_TIME

     */
    }
}
