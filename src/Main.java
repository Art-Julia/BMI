public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = (int)service.calculate(50,1.73);
        System.out.printf("%.2f", bmi);
    }

}
