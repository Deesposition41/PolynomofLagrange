package controller;

import controller.Polynom;

import java.util.Arrays;

public class PolynomLagrange {


    public static double[] getDeltaPolynomial(double[] x, int xpos) {
        double[] poly = {1};
        double znam = 1;
        for (int i = 0; i < x.length; i++) {
            if (i != xpos) {
                double[] p = {1, -x[i]};
                znam *= x[xpos] - x[i];
                poly = Polynom.mult(poly, p);
            }
        }
        return Polynom.scale(poly, 1 / znam);
    }

    public static double[] polynomLagrange(double[] x, double[] y) {
        int k = x.length;
        double[][] deltas = new double[k][k];
        double[] result = new double[k];

        for (int i = 0; i < k; i++) {
            deltas[i] = getDeltaPolynomial(x, i);
        }

        for (int i = 0; i < k; i++) {
            result = Polynom.sum(result, Polynom.scale(deltas[i], y[i]));
        }

        return result;
    }
}





