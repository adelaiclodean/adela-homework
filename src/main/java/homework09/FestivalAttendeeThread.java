package homework09;

public class FestivalAttendeeThread extends Thread{
    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {

        if (ticketType.equals(TicketType.FULL)||
                ticketType.equals(TicketType.FULL_VIP)||
                ticketType.equals(TicketType.FREE_PASS)||
                ticketType.equals(TicketType.ONE_DAY)||
                ticketType.equals(TicketType.ONE_DAY_VIP))
        this.ticketType = ticketType;
        else {
            throw new IllegalArgumentException("Ticket is not valid");
        }
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "FestivalAttendeeThread" +
                "ticketType=" + ticketType +
                ", gate=" + gate;
    }

    @Override
    public void run(){
        synchronized (this){
            System.out.println(ticketType);
            gate.addTicket(ticketType);
        }
    }
}
