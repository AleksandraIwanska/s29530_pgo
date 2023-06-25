import java.util.ArrayList;
import java.util.List;

public class House {
    private static int roomCount;
    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        roomCount++;
    }

    public void addRooms(List<Room> roomList) {
        rooms.addAll(roomList);
        roomCount += roomList.size();
    }

    public int getRoomCount() {
        return roomCount;
    }

    public static void main(String[] args) {
        House house = new House();

        Room livingRoom = new Room(20.0);
        Room kitchen = new Room(15.0);

        house.addRoom(livingRoom);
        house.addRoom(kitchen);

        System.out.println("Total Room Count in the House: " + house.getRoomCount());
    }
}
