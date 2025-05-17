import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIRequest request = new APIRequest();
        CurrencyRecord currency;

        int option = 0;
        boolean continueShowingMenu = true;

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

        while (continueShowingMenu) {
            System.out.println(menu);
            System.out.println("Write the desire option:");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    currency = request.currencyConversion("USD", "ARS", user_amount);
                    System.out.println("The amount of " + user_amount + " [USD] is " + currency.conversion_result() + " [ARS]");
                    break;
                case 2:
                currency = request.currencyConversion("ARS", "USD", user_amount);
                System.out.println("The amount of " + user_amount + " [ARS] is " + currency.conversion_result() + " [USD]");
                    break;
                case 3:
                    currency = request.currencyConversion("USD", "BRL", user_amount);
                    System.out.println("The amount of " + user_amount + " [USD] is " + currency.conversion_result() + " [BRL]");
                    break;
                case 4:
                    currency = request.currencyConversion("BRL", "USD", user_amount);
                    System.out.println("The amount of " + user_amount + " [BRL] is " + currency.conversion_result() + " [USD]");
                    break;
                case 5:
                    currency = request.currencyConversion("USD", "COP", user_amount);
                    System.out.println("The amount of " + user_amount + " [USD] is " + currency.conversion_result() + " [COP]");
                    break;
                case 6:
                    currency = request.currencyConversion("COP", "USD", user_amount);
                    System.out.println("The amount of " + user_amount + " [COP] is " + currency.conversion_result() + " [USD]");
                    break;
                case 7:
                    System.out.println("Write the new amount");
                    user_amount = scanner.nextDouble();
                    break;
                case 8:
                    continueShowingMenu = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        System.out.println("End of execution.");
    }
}
