package Homework11;

import java.util.UUID;

public class Accommodation {
    private UUID id;
    private String type;
    private String bedType;
    private int maxGuests;
    private String description;

    public Accommodation(UUID id, String type, String bedType, int maxGuests, String description) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.bedType = bedType;
        this.maxGuests = maxGuests;
        this.description = description;
    }
    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBedType() {
        return bedType;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Accommodation" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", bedType='" + bedType + '\'' +
                ", maxGuests=" + maxGuests +
                ", description='" + description;
    }
}
