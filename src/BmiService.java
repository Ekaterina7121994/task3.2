public class BmiService {
    public double calculate(int weight, double height) {
        int result = (int) (weight / (height * height));
        return result;
    }
}
