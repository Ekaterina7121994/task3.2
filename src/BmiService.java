public class BmiService {
    public double calculate(int a, double b){
        int weight = a; // вес
        double height = b;  // рост
        int result = (int) (a / (b * b));
    return result;
    }
}
