public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        double weightKg = 98.0;
        int bmi = service.calculate(heightMeters, weightKg); // для роста 1.87 метра и веса 98 кг он будет 28
        System.out.println("ИМТ: " + bmi);
    }
}
