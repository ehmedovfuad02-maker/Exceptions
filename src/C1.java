public class C1 {


    static int parseIntOrDefault(String s, int def) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return def;
        }
    }

    static double parseDoubleOrDefault(String s, double def) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return def;
        }
    }

    public static void main(String[] args) {

        int num1 = parseIntOrDefault("150", 0);
        int num2 = parseIntOrDefault("salam", -1); // Xətalı giriş

        System.out.println("int nəticə 1: " + num1); // Çıxış: 150
        System.out.println("int nəticə 2 (Default): " + num2); // Çıxış: -1

        System.out.println("---------------------------");

        double d1 = parseDoubleOrDefault("23.45", 0.0);
        double d2 = parseDoubleOrDefault("abc.5", 9.99);

        System.out.println("double nəticə 1: " + d1);
        System.out.println("double nəticə 2 (Default): " + d2);
    }
}
