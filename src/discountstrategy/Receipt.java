package discountstrategy;

/**
 * @author lhendrickson
 */

import java.text.NumberFormat;

public class Receipt {
 /**
 * create variables
 */
       private Customer customer;
       private LineItem[] lineItem = new LineItem[0]; 
       private FakeDatabase db;
       NumberFormat nf = NumberFormat.getCurrencyInstance();
       
/**
 * create finals to replace magic numbers
 */
       private static final String THANK_YOU = "Thank you for shopping at Khol's!";
       private static final String COME_AGAIN = "Come to see us again soon ";
       private static final String EXCLAMATION = "!";
       private static final String NEXT_LINE = "\n";
       private static final String STRING = "";
       private static final String FORMAT_BAR = " | ";
       private static final double ZERO_ZERO = 0.0;
       private static final String MINUS = "-";
       
/**
 * constructor (pass customerId)
 */
    public Receipt(String customerId) {
        this.db = new FakeDatabase();
        customer = lookupCustomerById(customerId);
    }

/**
 * locate customer by locating ID match using findCustomer
 */
    private Customer lookupCustomerById(String customerId) {
        customer = db.findCustomer(customerId);
        return customer;
    }

/**
 * adds an Item to LineItem
 */
    public void addLineItem(String productId, int qty) {
        LineItem item = new LineItem(productId, qty, db);
        addToArray(item);
    }
    
/**
 * cycles through LineItem and adds them to an array
 */
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItem.length);
        tempItems[lineItem.length] = item;
        lineItem = tempItems;
    }

/**
 * cycles through LineItem array and gathers the total price before discounts 
 * are added
 */
     public double getTotalBeforeDiscount() {
        double grandTotal = ZERO_ZERO;
        for(LineItem item : lineItem) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
     
/**
 * cycles through LineItem array and gathers the total price after discounts
 * are applied
 */
     public double getTotalAfterDiscount() {
        double grandDiscountTotal = ZERO_ZERO;
        for(LineItem item : lineItem) {
            grandDiscountTotal += item.getDiscountPriceSubtotal();
        }
        return grandDiscountTotal;
    }
     
/**
 * calculates amount saved 
 */
     public double getSavings() {
         double savings = ZERO_ZERO;
            savings += (getTotalBeforeDiscount() - getTotalAfterDiscount());
         return savings;
     }
     
/**
 * cycles through LineItem array and pulls the productName
 */
     private String getProductList(){
         String str = STRING;
         for(int i=0 ; i < lineItem.length; i++){
             str += lineItem[i].getProductName() + FORMAT_BAR + lineItem[i].getQty() + NEXT_LINE;
         }
         return str;
     }
     
/**
 * adds information to Receipt output such as
 * products in the list, total before discounts, savings, total after discounts
 */
     public String getReceipt() {
         
         String output = THANK_YOU + NEXT_LINE + NEXT_LINE;
         output += getProductList();
         output += nf.format(getTotalBeforeDiscount()) + NEXT_LINE;
         output += MINUS + nf.format(getSavings()) + NEXT_LINE;
         output += nf.format(getTotalAfterDiscount());
         output += NEXT_LINE + NEXT_LINE + COME_AGAIN + customer.getFullName() + EXCLAMATION;
         return output;
         
     }
     
}
