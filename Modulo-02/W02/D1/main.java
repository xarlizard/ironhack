
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("\n--- TASK 1: Education Level ---");
        System.out.print("Por favor, ingresa tu edad: ");
        int age = scanner.nextInt();

        if (age < 6 || age > 120) {
            System.out.println("Error: La edad debe estar entre 6 y 120 años");
        } else if (age <= 12) {
            System.out.println("Estás en primaria");
        } else if (age <= 16) {
            System.out.println("Estás en secundaria");
        } else if (age <= 22) {
            System.out.println("Estás en universidad");
        } else {
            System.out.println("Estás trabajando");
        }

        // Task 2
        System.out.println("\n--- TASK 2: Countdown and Squares ---");
        for (int i = 20; i >= 10; i--) {
            int square = i * i;
            System.out.println(i + " al cuadrado es: " + square);
        }

        // Task 3
        System.out.println("\n--- TASK 3: Parents' Ages ---");

        scanner.nextLine();

        System.out.print("¿Cómo se llama tu madre? ");
        String motherName = scanner.nextLine();

        System.out.print("¿Qué edad tiene tu madre? ");
        double motherAge = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("¿Cómo se llama tu padre? ");
        String fatherName = scanner.nextLine();

        System.out.print("¿Qué edad tiene tu padre? ");
        double fatherAge = scanner.nextDouble();

        double averageAge = (motherAge + fatherAge) / 2.0;

        System.out.printf("Tu madre se llama %s y tiene %.0f años, y tu padre se llama %s y tiene %.0f años, y la media de sus edades es %.1f",
                motherName, motherAge, fatherName, fatherAge, averageAge);

        scanner.close();
    }
}
