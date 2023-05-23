public class BmiService {

    public double bmi(int a, double b) {
        double result;
        result = a / (b * b);
        return (int)result;
    }
}
