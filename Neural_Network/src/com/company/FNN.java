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

    @Override
    public void forward(double[][] x){

        for (int i = 0; i < weights.size() - 1; i++) {
            x = matrixMultiplication(x, weights.get(i));
            x = relu(x);
        }

    }

    public double[][] relu(double[][] data){
        for(int i=0; i < data.length; i++){
            for(int j=0; j < data[0].length; j++){
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }
            }
        }
        return data;
        }


    public double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB){

        int aRows = matrixA.length;
        int aCols = matrixA[0].length;
        int bCols = matrixB[0].length;

        double[][] result = new double[aRows][bCols];

        for(int i=0; i < aRows; i++){
            for(int j=0; j < bCols; j++){
                result[i][j] = 0;
                for(int z=0; z < aCols; z++){
                    result[i][j] += matrixA[i][z] * matrixB[z][j];
                }
            }
        }
        return result;
    }

    @Override
    public void backward(){

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

}
