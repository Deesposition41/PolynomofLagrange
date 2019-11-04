package view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Uzly;
public class ConcoleView {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public double[] uzlyx() throws IOException {
        System.out.println("Vvedi uzly:");
       String s1 = reader.readLine();
       String[] temp=s1.split(" ");
       double[] x=new double[temp.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = Double.parseDouble(temp[i]);
        }
        return x;
    }

    public double[] uzlyy() throws IOException {
        System.out.println("Vvedi znacheniya:");
        String s1 = reader.readLine();
        String[] temp=s1.split(" ");
        double[] y=new double[temp.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = Double.parseDouble(temp[i]);
        }
        return y;
    }



    public static String convert(double[] coaef) {
        String s = "";
        int n = coaef.length;
        for (int i = 0; i < n; i++) {
            if (coaef[i] > 0 && s != "") {
                s += "  +  ";
            }
            if (coaef[i] < 0) {
                coaef[i] = coaef[i] * (-1);
                s += "  -  ";
            }
            if (coaef[i] != 0) {
                if (coaef[i] == (int) coaef[i]) {
                    if (coaef[i] != 1 || (coaef[i] == 1 && n - i - 1 == 0)) {
                        s += Integer.toString((int) coaef[i]);
                    }
                } else {
                    s += Double.toString(coaef[i]);
                }
            }
            if (coaef[i] != 0) {
                if (n - i - 1 == 1) {
                    s += "x";
                } else if (n - i - 1 > 1) {
                    s += "x^" + Integer.toString(n - i - 1);
                }
            }
        }
        return "f(x) = " + s;
    }
}

