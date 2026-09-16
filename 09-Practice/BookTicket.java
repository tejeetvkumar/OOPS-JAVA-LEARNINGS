class TicketCounter implements Runnable {
    int availableTickets;

    synchronized void bookTicket() {
        if (availableTickets > 0) {
            availableTickets = availableTickets - 1;

            System.out.println("Ticket booked by "
                    + Thread.currentThread().getName());

            System.out.println("Available tickets: "
                    + availableTickets);
        } else {
            System.out.println("Ticket not available for "
                    + Thread.currentThread().getName());
        }
    }

    public void run() {
        while (availableTickets > 0) {
            bookTicket();
        }
    }
}

public class BookTicket {
    public static void main(String[] args) {
        TicketCounter tc = new TicketCounter();
        tc.availableTickets = 10;

        Thread t1 = new Thread(tc);
        Thread t2 = new Thread(tc);

        t1.setName("User 1");
        t2.setName("User 2");

        t1.start();
        t2.start();
    }
}