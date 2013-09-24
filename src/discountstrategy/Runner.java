package discountstrategy;

/**
 * @author lhendrickson
 */

public class Runner {

    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
       
        
        // start new sale, pass custId
        cr.startNewSale("3");
        // add item, pass prodId and qty
        cr.addItemToSale("1", 2);
        // add item, pass prodId and qty
        cr.addItemToSale("4", 1);
        // add item, pass prodId and qty
        cr.addItemToSale("5", 4);
        // finalize sale
        System.out.println(cr.finalizeSale());
//        
//        // start new sale, pass custId
//        cr.startNewSale("2");
//        // add item, pass prodId and qty
//        cr.addItemToSale("2", 9);
//        // add item, pass prodId and qty 
//        cr.addItemToSale("3", 1);
//        // finalize sale
//        System.out.println(cr.finalizeSale());
        
    }
}
