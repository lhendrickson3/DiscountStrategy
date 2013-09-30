package discountstrategy;

/**
 * @author lhendrickson
 */

public class CashRegister {
/**
 * create variables
 */
    private Receipt receipt;
    private OutputStrategy os = new GUIOutput();
    
/**
 * constructor nothing passed
 */
    public CashRegister(){
   
    }

/**
 * startNewSale starts a new sale (pass customerId)
 * creates new Receipt with customer ID
 */
    public void startNewSale(String customerId) {
        receipt = new Receipt(customerId);
    }

/**
 * add each item to receipt (pass productId and qty)
 */
    public void addItemToSale(String productId, int qty) {
	receipt.addLineItem(productId, qty);
    }
    
/**
 * method to finalizeSale
 * returns getReceipt from receipt class
 */

    
    public void produceOutput(){
        os.getOutput(receipt.getReceipt());
     }
}
