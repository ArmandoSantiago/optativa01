import java.util.Arrays;

public class Metodos {
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public String ordenar(Object [] n){
        Arrays.sort(n);
        return Arrays.toString(n);
    }
}
