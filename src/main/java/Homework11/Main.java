package Homework11;

import java.util.UUID;

public class Main {
    public static void main( String[] args ) {

        Accommodation ac1 = new Accommodation(UUID.randomUUID(),"hotel", "double", 2, "double-bed room with mountain view");
        RoomFair rf1 = new RoomFair(UUID.randomUUID(),132.00, "winter");
        Accommodation ac2 = new Accommodation(UUID.randomUUID(),"hotel", "twin", 2, "two-beds");
        RoomFair rf2 = new RoomFair(UUID.randomUUID(),330.00, "autumn");

        DatabaseApp.getInstance().addAccommodation(ac1);
        DatabaseApp.getInstance().addRoomFair(rf1);
        DatabaseApp.getInstance().addAccommodation(ac2);
        DatabaseApp.getInstance().addRoomFair(rf2);
        AccommodationFairRelation af = new AccommodationFairRelation(UUID.randomUUID(), ac1.getId(), rf1.getId());
        AccommodationFairRelation af2 = new AccommodationFairRelation(UUID.randomUUID(),ac2.getId(), rf2.getId());
        DatabaseApp.getInstance().addAccommodationFairRelation(af);
        DatabaseApp.getInstance().addAccommodationFairRelation(af2);
        DatabaseApp.getInstance().printPricesForRooms();
    }
}
