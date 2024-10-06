package week4;

public class TheCustomerAndInvoiceItem {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Daniyar", 10);
        System.out.println(c1);

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Discount: " + c1.getDiscount());

        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("ID: " + inv1.getId());
        System.out.println("Customer: " + inv1.getCustomer());
        System.out.println("Amount: " + inv1.getAmount());
        System.out.println("Customer's ID: " + inv1.getCustomerId());
        System.out.println("Customer's name: " + inv1.getCustomerName());
        System.out.println("Customer's discount: " + inv1.getCustomerDiscount());
        System.out.printf("Amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}


class Customer {
    private final int id;
    private final String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}

class Invoice {
    private final int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
    }
}
