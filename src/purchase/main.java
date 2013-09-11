//eksempel fra bogen side 160 og 161
package purchase;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author vimk
 */
public class main
{
    public static void main(String[] args)
    {
        final double TAX_RATE = 0.06; //6% of sales tax 
        int quantity;
        double subtotal, tax, totalCost, unitPrice; 
        
        Scanner scan = new Scanner (System.in);
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        
        System.out.print ("Enter the unit price: ");
        unitPrice = scan.nextDouble();
        
        subtotal =quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        
        //print output with appropriate formatting
        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));
        
    }
}
