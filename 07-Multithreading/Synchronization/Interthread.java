public class Interthread {

    public static void main(String args[]) {

        bankaccount b = new bankaccount();

        Thread t1 = new Thread() {
            public void run() {
                b.withdraw(1000);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                b.deposit(2000);
            }
        };

        t1.start();
        t2.start();
    }
}

class bankaccount {

    int balance = 500;

    synchronized void withdraw(int amount) {

        System.out.println("going to withdraw...");

        if (balance < amount) {

            System.out.println("Less balance; waiting for deposit...");

            try {
                wait();
            } catch (Exception e) {
            }
        }

        balance -= amount;

        System.out.println("withdraw completed..." + balance);
    }

    synchronized void deposit(int amount) {

        System.out.println("going to deposit...");

        balance += amount;

        System.out.println("deposit completed..." + balance);

        notify();
    }
}