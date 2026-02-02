public class AgeBVA {

    public static void main(String[] args) {

        System.out.println("BOUNDARY VALUE ANALYSIS - AGE VALIDATION");

        checkAge(17);  // Below minimum
        checkAge(18);  // Minimum
        checkAge(30);  // Normal
        checkAge(60);  // Maximum
        checkAge(61);  // Above maximum
    }

    static void checkAge(int age) {

        if (age >= 18 && age <= 60) {
            System.out.println("Age " + age + " - VALID");
        } else {
            System.out.println("Age " + age + " - INVALID");
        }
    }
}