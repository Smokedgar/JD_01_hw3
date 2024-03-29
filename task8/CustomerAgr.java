package by.htp.hw3.task8;
import java.util.ArrayList;
import java.util.List;

public class CustomerAgr {
    private List<Customer> customers;

    public CustomerAgr() {
	customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer c) {
	customers.add(c);
    }

    public List<Customer> selectCustomersByCreditCardNumber(long minNumber, long maxNumber) {
	List<Customer> selected = new ArrayList<Customer>();
	for (Customer customer : this.customers) {
	    long creditCard = customer.getCreditCard();
	    if (creditCard >= minNumber && creditCard <= maxNumber) {
		selected.add(customer);
	    }
	}
	return selected;
    }
    public Customer[] sortCustomers() {
	Customer[] sorted = new Customer[this.customers.size()];
	int lastI = 0;
	for (Customer customer : this.customers) {
	    sorted[lastI] = customer;
	    lastI++;
	}
	boolean oneMore = true;
	while (oneMore) {
	    oneMore = false;
	    for (int i = 0; i < sorted.length - 1; i++) {
		String currentCustomer = sorted[i].getLastName();
		String nextCustomer = sorted[i + 1].getLastName();
		int compareResult = currentCustomer.compareTo(nextCustomer);
		if (compareResult > 0) {
		    Customer temp = sorted[i];
		    sorted[i] = sorted[i + 1];
		    sorted[i + 1] = temp;
		    oneMore = true;
		} else if (compareResult == 0) {
		    currentCustomer = sorted[i].getFirstName();
		    nextCustomer = sorted[i + 1].getFirstName();
		    if (currentCustomer.compareTo(nextCustomer) > 0) {
			Customer temp = sorted[i];
			sorted[i] = sorted[i + 1];
			sorted[i + 1] = temp;

			oneMore = true;
		    }
		}
	    }
	}
	return sorted;
    }
}
