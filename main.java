package senhaget;
import java.util.Random;
import java.util.Scanner;
public class main{
  public static void main(String[] args) {
  
        System.out.println("Gerador de senhas");

        Scanner scanner = new
        Scanner(System.in);
        int ENT = scanner.nextInt();

        if (ENT == 1) {
       
            String password = generateRandomPassword();
            System.out.println("Generated password: " + password);
        } else {
            System.out.println("Invalid input. Please enter 1 to generate a password.");
        }
    }

    private static String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();
        
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}

