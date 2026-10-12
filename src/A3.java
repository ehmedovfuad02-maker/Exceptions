public class A3 {
    public static void main(String[] args) {
        String[] values = {"12", "abc", "7", "", "3.5", "-4"};
        int sum = 0;

        for (String s : values) {
            try {
                int num = Integer.parseInt(s);
                System.out.println(s + " ->  " + num);
                sum += num;
            } catch (NumberFormatException e) {

                System.out.println(s + ": rəqəm deyil");

            }
        }

        System.out.println("\nDüzgün çevrilən ədədlərin cəmi: " + sum);
    }
}
