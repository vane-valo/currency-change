import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIRequest request = new APIRequest();
        int option = 0;

        System.out.println("********** WELCOME TO CURRENCY CONVERTER **********");

        String menu = """
                1. United States Dollar	==> Argentine Peso
                2. Argentine Peso       ==> United States Dollar
                3. United States Dollar ==> Brazilian Real
                4. Brazilian Real       ==> United States Dollar
                5. United States Dollar	==> Colombian Peso
                6. Colombian Peso       ==> United States Dollar
                7. Change amount
                8. Exit
                """;

        System.out.println("Write the amount you want to convert:");
        double user_amount = scanner.nextDouble();

        while (option != 8) {
            System.out.println(menu);
            option = scanner.nextInt();

            switch (option){
                case 1:

            }
        }
    }
}
