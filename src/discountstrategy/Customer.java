package discountstrategy;

/**
 * @author lhendrickson
 */

public class Customer {
/**
 * create variables specific to a customer
 */
        private String customerId;
        private String firstName;
        private String lastName;
        
        private TaxStrategy tax;
        
/**
 * create final variables to fix magic numbers
 */
        private static final String SPACE = " ";
        private static final double ZERO = 0;
        private static final String ERROR = "Invalid Input";

/**
 * customer constructor (pass customerId, firstName, and lastName)
 */
    public Customer(String customerId, String firstName, String lastName, TaxStrategy t) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        tax = t;
    }
    
/**
 * get a full name from combining firstName and lastName
 * returns first name + last name
 */
    public String getFullName() {
        return firstName + SPACE + lastName;
    }

/**
 * method to getCostomerId
 * returns customer id
 */
    public String getCustomerId() {
        return customerId;
    }

/**
 * method to setCustomerId (if null or 0 throw Exception) 
 */
    public void setCustomerId(String customerId) {
        if (customerId == null || customerId.length() == ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.customerId = customerId;
    }

/**
 * method to getFirstName
 * returns firstName
 */
    public String getFirstName() {
        return firstName;
    }

/**
 * method to setFirstName (if null or 0 throw Exception)
 */    
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.firstName = firstName;
    }
    
/**
 * method to getLastName
 * return lastName
 */
    public String getLastName() {
        return lastName;
    }

/**
 * method to setLastName (if null or 0 throw Exception)
 */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() == ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.lastName = lastName;
    }
    
/**
 * This method gets tax that will be applied to this customer
 * @return getTax from TaxStrategy
 */
    public double getTaxToApply(){
        return tax.getTax();
    }
}
