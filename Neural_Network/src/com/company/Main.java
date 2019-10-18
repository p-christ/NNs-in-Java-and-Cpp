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

        double[][] trainingData = generateRandomTrainingData(rows, cols);






        // write your code here
    }


    public static double[][] generateRandomTrainingData(int rows, int cols){

        double[][] trainingData = new double[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                trainingData[i][j] = Math.random();
            }
        }
        return trainingData;
    }


    // forward pass  ... store data
    // backward pass
    // initialisation --> random weights and creating arrays

}
