package homework09;

import junit.framework.TestCase;
import org.junit.Test;

public class FestivalAttendeeThreadTest extends TestCase {

    @Test
    public void test_ticket_type(){
        FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(TicketType.generateTicket(),new FestivalGate());
    }
    @Test
    public void test_statistics(){
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(new FestivalGate());
    }
}