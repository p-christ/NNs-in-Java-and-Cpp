package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.print("hello");

        ArrayList<Integer> layers = new ArrayList<>(Arrays.asList(10,10,1));
        double learningRate = 0.1;


        FNN nn = new FNN(layers, learningRate);   // , learningRate);

        // write your code here
    }

    // forward pass  ... store data
    // backward pass
    // initialisation --> random weights and creating arrays
    
}
