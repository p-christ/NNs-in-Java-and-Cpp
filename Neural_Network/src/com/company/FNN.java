package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class FNN implements NN {

    private double learningRate;
    private ArrayList<Integer> layers;
    private ArrayList<double[][]> weights;

    FNN(ArrayList<Integer> layers, double learningRate) { // }, float learningRate){
        this.learningRate = learningRate;
        this.layers = layers;
        this.weights = initialise();
    }

    /**
     * Randomly initialises the weights of the network
     */
    @Override
    public ArrayList initialise() {
        int row_weights;
        int col_weights;
        double[][] weights;
        ArrayList<double[][]> weightsList = new ArrayList<>();
        for (int i = 0; i < layers.size() - 1; i++) {
            row_weights = layers.get(i);
            col_weights = layers.get(i + 1);
            weights = generateRandomValues(row_weights, col_weights);
            weightsList.add(weights);
        }

        return weightsList;
    }


    public double[][] generateRandomValues(int rows, int cols){
        double[][] values = new double[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                values[i][j] = Math.random();
            }
        }
        return values;
    }

    /**
     * Run a full training iteration
     */
    @Override
    public void runTrainingIteration(ArrayList x){

    }

    @Override
    public void calculate_loss(float y_true, float y_predict){

    }

    @Override
    public void forward(double[][] x){


    }


    public double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB){

        int aRows = matrixA.length;
        int aCols = matrixA[0].length;
        int bRows = matrixB.length;
        int bCols = matrixB[0].length;

        double[][] result = new double[aRows][bCols];

        for(int i=0; i < aRows)


    }

        //creating another matrix to store the multiplication of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {

                }


    @Override
    public void backward(){


    }

}
