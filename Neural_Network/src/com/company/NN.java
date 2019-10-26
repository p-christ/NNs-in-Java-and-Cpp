package com.company;

import java.util.ArrayList;

public interface NN {

    /**
     * Initialises the weights of the network
     */
    public ArrayList initialise();

    /**
     * Run a full training iteration
     */
    public void runTrainingIteration(ArrayList x);

    /**
     * Runs a forward pass of the network
     */
    public void forward(ArrayList x);

    /**
     * Runs a backward pass of the network, updating the parameters
     */
    public void backward();

    /**
     * Calculates the loss for an observation
     */
    public void calculate_loss(float y_true, float y_predict);


}
