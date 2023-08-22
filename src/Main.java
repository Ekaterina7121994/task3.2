public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate(98, 1.87);
        System.out.println(bmi);
        int bmi2 = (int) service.calculate(60, 1.70);
        System.out.println(bmi2);
        int bmi3 = (int) service.calculate(70, 1.64);
        System.out.println(bmi3);
    }
}