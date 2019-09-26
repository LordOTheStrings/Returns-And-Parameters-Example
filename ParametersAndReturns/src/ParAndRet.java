import java.lang.Math;

public class ParAndRet {

    public static void main(String[] args) {
        double num1 = Math.PI;
        double num2 = Math.E;
        double num3 = (num1 * num2);
        double newNumber = runChange(num1, num2, num3);
        System.out.println(num3);
    }
    public static double runChange(double num1, double num2, double num3) {
        double sin = Math.sin(num1 * num2 * num3);
        System.out.println(sin);
        return sin;
    }
}

