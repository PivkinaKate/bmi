public class BmiService {

    public double bmi(int weight, double height) {
        double result;
        result = weight / (height * height);
        return (int)result;
    }
}
