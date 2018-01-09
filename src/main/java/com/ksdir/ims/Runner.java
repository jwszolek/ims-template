package com.ksdir.ims;

import org.math.plot.Plot2DPanel;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        System.out.println("This is the main method.");
        drawPlot();
    }


    private static void drawPlot() {
        double[] x = {1,2,3,4};
        double[] y = {1,2,3,4};

        // create your PlotPanel (you can use it as a JPanel)
        Plot2DPanel plot = new Plot2DPanel();

        // add a line plot to the PlotPanel
        plot.addLinePlot("my plot", x, y);

        // put the PlotPanel in a JFrame, as a JPanel
        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot);
        frame.setVisible(true);
    }

}
