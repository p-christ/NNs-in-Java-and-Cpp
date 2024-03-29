package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.print("hello");

        ArrayList<Integer> layers = new ArrayList<>(Arrays.asList(10,10,1));
        double learningRate = 0.1;
        int rows = 5;
        int cols = 8;

        FNN nn = new FNN(layers, learningRate);

        double[][] trainingData = nn.generateRandomValues(rows, cols);

        nn.initialise();

    }

}
