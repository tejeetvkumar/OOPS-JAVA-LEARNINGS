interface Payment {
    void payment();
}

class UPIPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment made using UPI.");
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment made using Credit Card.");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        p1.payment();

        Payment p2 = new CreditCardPayment();
        p2.payment();
    }
}
