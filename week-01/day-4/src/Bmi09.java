public class Bmi09 {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        System.out.println(Bmi(massInKg, heightInM));
    }

    private static double Bmi(double massInKg, double heightInM) {
        double bmi = massInKg/(heightInM*heightInM);
        return bmi;
    }
}
