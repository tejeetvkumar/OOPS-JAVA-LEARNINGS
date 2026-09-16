public class TicketBooking implements Runnable {

    int availableTickets = 10;

    synchronized void bookTicket() {

        if (availableTickets > 0) {

            System.out.println("Ticket booked by "
                    + Thread.currentThread().getName());

            availableTickets--;

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
