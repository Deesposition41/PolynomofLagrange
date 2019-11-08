package controller;

public class Polynom {

    public static double[] sum(double x1[], double y1[]) {
        int k = x1.length;
        int h = y1.length;
        int p;
        if (k > h) {
            p = k;
        } else p = h;
        double[] rez = new double[p];
        for (int i = 0; i < k; i++) {
            rez[i] += x1[i];
        }
        for (int i = 0; i < h; i++) {
            rez[i] += y1[i];
        }
        return rez;
    }


    public static double[] mult(double[] x1, double[] y1) {
        int k = x1.length;
        int t = y1.length;
        double[] result = new double[k + t - 1];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < t; j++) {
                result[i + j] += x1[i] * y1[j];
            }
        }
        return result;
    }

    public static double[] scale(double[] x1, double k) {
        double[] y1 = new double[x1.length];
        for (int i = 0; i < x1.length; i++) {
            y1[i] = x1[i] * k;
        }
        return y1;
    }
}
