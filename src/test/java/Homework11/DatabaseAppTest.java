package Homework11;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class DatabaseAppTest {
    @Test
    public void test_insert_into(){
        Accommodation ac1 = new Accommodation(UUID.randomUUID(),"hotel", "double", 2, "double-bed room with mountain view");
        RoomFair rf1 = new RoomFair(UUID.randomUUID(),132.00, "winter");
        DatabaseApp.getInstance().addAccommodation(ac1);
        DatabaseApp.getInstance().addRoomFair(rf1);
        AccommodationFairRelation af = new AccommodationFairRelation(UUID.randomUUID(), ac1.getId(), rf1.getId());
        DatabaseApp.getInstance().addAccommodationFairRelation(af);
    }
    @Test
    public void print_prices_rooms(){
        DatabaseApp.getInstance().printPricesForRooms();
    }
    @Test
    public void test_get_bed_type(){
        Accommodation bedType = new Accommodation(UUID.randomUUID(),"hotel", "double", 2, "double-bed room with mountain view");
        assertEquals(bedType.getBedType(),"double");
    }
    @Test
    public void test_get_hotel_type(){
        Accommodation hotelType = new Accommodation(UUID.randomUUID(),"hotel", "double", 2, "double-bed room with mountain view");
        assertEquals(hotelType.getType(),"hotel");
    }
    @Test
    public void test_max_guests(){
        Accommodation maxGuests = new Accommodation(UUID.randomUUID(),"hotel", "double", 2, "double-bed room with mountain view");
        assertEquals(maxGuests.getMaxGuests(),2);
    }
}