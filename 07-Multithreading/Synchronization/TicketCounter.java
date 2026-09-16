public class TicketCounter {

    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking();

        Thread t1 = new Thread(tb);
        Thread t2 = new Thread(tb);

        t1.setName("User 1");
        t2.setName("User 2");

        t1.start();
        t2.start();
    }
}
