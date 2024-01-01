import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import.java.util.*;
public class CurrencyConverter1
{

    public static void main(String[] args) 
{
        Map<String, Double> curr = new HashMap<>();
        curr.put("USD", 1.0);  // US Dollar
        curr.put("EUR", 0.85); // Euro
        curr.put("GBP", 0.73); // British Pound
        curr.put("JPY", 112.14); // Japanese Yen
        curr.put("INR", 72.89); //Indian Rupee
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the source currency: ");
        String sourceCurrency = sc.next().toUpperCase();
        System.out.print("Enter the target currency: ");
        String targetCurrency = sc.next().toUpperCase();
        double sourceToUSD = amount / curr.get(sourceCurrency);
        double result = sourceToUSD * curr.get(targetCurrency);
        System.out.println(amount + " " + sourceCurrency + " is equal to " + result + " " + targetCurrency);

        
    }
}
