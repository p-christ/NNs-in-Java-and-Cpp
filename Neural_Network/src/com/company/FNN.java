package com.company;

import java.util.ArrayList;

public class FNN implements NN {

    private double learningRate;
    private ArrayList<Integer> layers;

    FNN(ArrayList<Integer> layers, double learningRate) { // }, float learningRate){
        this.learningRate = learningRate;
        this.layers = layers;
//        learningRate = learningRate;
    }

    /**
     * Initialises the weights of the network
     */
    @Override
    public void initialise(){

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
