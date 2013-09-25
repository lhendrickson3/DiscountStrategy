package discountstrategy;

/**
 * @author lhendrickson
 */

	public class FakeDatabase {
	    private Customer[] customers = {
	        new Customer("1", "Dean", "Blue", new TaxExempt()),
	        new Customer("2", "Sam", "Green", new WisconsinTax(.05)),
	        new Customer("3", "Ruby", "Red", new TaxExempt())
	    };

	    Product[] products = {
	        new Product("1", "Women's Sweatshirt", 19.95, new SaleDiscount(0.15)),
	        new Product("2", "Men's T-Shirt", 3.25, new QuantityDiscount(.10, 3)),
	        new Product("3", "Men's Shoes", 29.99, new NoDiscount()),
                new Product("4", "Skirt", 24.75, new NoDiscount()),
                new Product("5", "Women's Scarf", 5.00, new QuantityDiscount(.50,2))
	    };

	    public final Customer findCustomer(final String custId) {
	        // validation is needed
	        Customer customer = null;
	        for(Customer c : customers) {
	            if(custId.equals(c.getCustomerId())) {
	                customer = c;
	                break;
	            }
	        }

	        return customer;
	    }


	    public final Product findProduct(final String prodId) {
	        // validation is needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProductId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
            
            
            
	} 

