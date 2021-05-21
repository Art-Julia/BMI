public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = Math.round((weight / Math.pow(height,2))*100)/100D;
        return bmi;
}
}
