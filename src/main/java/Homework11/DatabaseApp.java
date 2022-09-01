package Homework11;

import java.sql.*;

public class DatabaseApp{

    public Connection connection;
    private static DatabaseApp instance;

    private DatabaseApp() {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/adela?user=postgres&password=adela";
            connection = DriverManager.getConnection(url);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DatabaseApp getInstance() {
        if (instance == null) {
            instance = new DatabaseApp();
        }
        return instance;
    }

    public void addAccommodation(Accommodation accommodation) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into accommodation VALUES (?,?,?,?,?)");
            preparedStatement.setObject(1, accommodation.getId());
            preparedStatement.setString(2, accommodation.getType());
            preparedStatement.setString(3, accommodation.getBedType());
            preparedStatement.setInt(4, accommodation.getMaxGuests());
            preparedStatement.setString(5, accommodation.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void addRoomFair(RoomFair roomFair) {
        try{
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO room_fair VALUES (?,?,?)");
            preparedStatement.setObject(1, roomFair.getId());
            preparedStatement.setDouble(2, roomFair.getValue());
            preparedStatement.setString(3, roomFair.getSeason());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAccommodationFairRelation(AccommodationFairRelation accommodationFairRelation) {
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO accommodation_fair_relation VALUES (?,?,?)");
            preparedStatement.setObject(1, accommodationFairRelation.getId());
            preparedStatement.setObject(2, accommodationFairRelation.getAccommodationId());
            preparedStatement.setObject(3, accommodationFairRelation.getRoomFairId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printPricesForRooms() {
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT accommodation.type as room, room_fair.value as price\n" +
                    "FROM accommodation_fair_relation\n" +
                    "INNER JOIN accommodation ON \n" +
                    "accommodation_fair_relation.id_accommodation = accommodation.id\n" +
                    "INNER JOIN room_fair\n" +
                    "ON accommodation_fair_relation.id_room_fair = room_fair.id");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("The type of room is:"+resultSet.getString("room"));
                System.out.println("The price of room is:"+resultSet.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
