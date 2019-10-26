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

        ArrayList<double[][]> weightsList = new ArrayList<>();

        for (int i = 0; i < layers.size() - 1; i++) {
            row_weights = layers.get(i);
            col_weights = layers.get(i + 1);

            double[][] weights = generateRandomValues(row_weights, col_weights);
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
    public void forward(ArrayList x){

    }

    @Override
    public void backward(){


    }

}
