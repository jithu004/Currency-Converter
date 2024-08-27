import java.util.Scanner;

public class CurrencyConverter {  
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Welcome to the Currency Converter!");  
        while (true) {  
             
            System.out.println("\nMenu:");  
            System.out.println("1. Convert USD to EUR");  
            System.out.println("2. Convert EUR to USD");
            System.out.println("3. Convert INR to USD");
            System.out.println("4. Convert USD to INR");  
            System.out.println("5. Quit");  
            System.out.print("Enter your choice: ");  
            int choice = scanner.nextInt();  
            switch (choice) {  
                case 1:  
                    convertUSDToEUR();  
                    break;  
                case 2:  
                    convertEURToUSD();  
                    break;    
                case 3: 
                    convertINRToUSD();
                    break;
                case 4:
                     convertUSDToINR();    
                case 5:  
                    System.out.println("Thank you for using the Currency Converter!"); 
                    scanner.close();  
                    return;  
                default:  
                    System.out.println("Invalid choice. Please try again.");  
            }  
        }  
    }   
    private static double usdToEurRate = 0.90;  
    private static double eurToUsdRate = 1.12;
    private static double inrToUsdRate = 0.012;
    private static double usdToInrRate = 83.92;
    // Method to convert USD to EUR  
    private static void convertUSDToEUR() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in USD: ");  
        double usdAmount = scanner.nextDouble();  
        double eurAmount = usdAmount * usdToEurRate;  
        System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");  
    }  
    // Method to convert EUR to USD  
    private static void convertEURToUSD() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in EUR: ");  
        double eurAmount = scanner.nextDouble();  
        double usdAmount = eurAmount * eurToUsdRate;  
        System.out.println(eurAmount + " EUR is equivalent to " + usdAmount + " USD"); 
    } 
    // Method to convert INR to USD
    private static void convertINRToUSD() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in INR: ");  
        double inrAmount = scanner.nextDouble();  
        double usdAmount = inrAmount * inrToUsdRate;  
        System.out.println(inrAmount + " INR is equivalent to " + usdAmount + " USD");
    }  
    private static void convertUSDToINR(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double inrAmount = usdAmount*usdToInrRate;
        System.out.println(usdAmount+" USD is equivalent to "+ inrAmount+" INR");
    }
}  