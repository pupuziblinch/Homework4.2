public class BmiService {
    public int calculate(double heightMeters, double weightKg) {
        double index = weightKg / (heightMeters * heightMeters);
        return (int) index;
    }
}
