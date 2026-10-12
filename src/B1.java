class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class B1 {

    public static void registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Xəta: " + name + "  daxil edilən yaş (" + age + ") 18 ilə 120 arasında olmalıdır!");
        }
        System.out.println(" İstifadəçi: " + name + ", Yaş: " + age);
    }

    public static void main(String[] args) {

        try {
            System.out.println(" yanlış hal yoxla");
            registerUser("Emin", 15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();


        try {
            System.out.println(" düzgün hal ");
            registerUser("Lalə", 25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


