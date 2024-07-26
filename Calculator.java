import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choisissez une opération : ");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Division euclidienne avec reste");
            System.out.println("6. Modulo");
            System.out.println("7. Quitter");

            int choix = scanner.nextInt();

            if (choix == 7) {
                running = false;
                System.out.println("Quitter l'application...");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            int num1 = scanner.nextInt();
            System.out.print("Entrez le deuxième nombre : ");
            int num2 = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Résultat : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Résultat : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Résultat : " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Résultat : " + (double) num1 / num2);
                    } else {
                        System.out.println("Erreur : Division par zéro");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        System.out.println("Quotient : " + (num1 / num2));
                        System.out.println("Reste : " + (num1 % num2));
                    } else {
                        System.out.println("Erreur : Division par zéro");
                    }
                    break;
                case 6:
                    if (num2 != 0) {
                        System.out.println("Résultat : " + (num1 % num2));
                    } else {
                        System.out.println("Erreur : Division par zéro");
                    }
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une opération valide.");
            }
        }

        scanner.close();
    }
}
