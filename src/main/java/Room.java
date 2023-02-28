import java.util.ArrayList;
import java.util.List;

public class Room {

    // These are our property 'declarations'
    // Declaring a property means creating the space in memory and giving it a label
    private String name;
    private String description;
    private List<Room> adjacentRooms;
    private NPC npc;
    private List<Item> items;

    public Room(String name, String description, List<Room> adjacentRooms){
        this.name = name;
        this.description = description;
        this.adjacentRooms = adjacentRooms == null ? new ArrayList<>() : adjacentRooms;
        //this.adjacentRooms = adjacentRooms;
        this.items = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    public void addRoom(Room room){
        this.adjacentRooms.add(room);
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public Item removeItem(Item item){
        this.items.remove(item);
        return item;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", npc=" + npc +
                ", items=" + items +
                '}';
    }
}
