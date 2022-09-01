package Homework11;

import java.util.UUID;

public class AccommodationFairRelation {
    private UUID id;
    private UUID accommodationId;
    private UUID roomFairId;

    public AccommodationFairRelation(UUID id, UUID accommodationId, UUID roomFairId) {
        this.id = UUID.randomUUID();
        this.accommodationId = accommodationId;
        this.roomFairId = roomFairId;
    }

    public UUID getId() {
        return id;
    }

    public UUID getAccommodationId() {
        return accommodationId;
    }

    public UUID getRoomFairId() {
        return roomFairId;
    }

    @Override
    public String toString() {
        return "AccommodationFairRelation" +
                "id=" + id +
                ", accommodationId=" + accommodationId +
                ", roomFairId=" + roomFairId;
    }
}
