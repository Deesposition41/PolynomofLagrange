import view.ConcoleView;
import controller.PolynomLagrange;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Nachnem!");
        double[] x=ConcoleView.uzlyx();
        double[] y=ConcoleView.uzlyy();
        System.out.println(ConcoleView.convert(PolynomLagrange.polynomLagrange(x,y)));
    }
}