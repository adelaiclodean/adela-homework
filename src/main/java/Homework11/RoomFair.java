package Homework11;

import java.util.UUID;

public class RoomFair {
    private UUID id;
    private double value;
    private String season;

    public RoomFair(UUID id, double value, String season) {
        this.id = UUID.randomUUID();
        this.value = value;
        this.season = season;
    }

    public UUID getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "RoomFair" +
                "id=" + id +
                ", value=" + value +
                ", season='" + season;
    }
}
