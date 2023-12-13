import java.util.ArrayList;

public class Player {
    private String name;
    private double maxWeight;
    private Room currentRoom;
    private ArrayList<Item> bag;

    public Player(String name, double maxWeight) {
        bag = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean go(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            return false;
        } else {
            setCurrentRoom(nextRoom);
            return true;
        }
    }

    private double getBagWeight() {
        double totalWeight = 0;
        for(Item i : bag) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public TakeStatus take(String itemName) {
        Item item = currentRoom.getItem(itemName);
        if(item!=null && getBagWeight() + item.getWeight() <= maxWeight) {
            bag.add(item);
            return TakeStatus.SUCCESS;
        } else if(item!=null) {
            currentRoom.setItem(item);
            return TakeStatus.TOOHEAVY;
        } else {
            return TakeStatus.NOTPRESENT;
        }
    }

    public String getInfo() {
        String info = name;
        if (!bag.isEmpty()) {
            info += " has following items in the bag\n";
            for(Item i : bag) {
                info += "  " + i + "\n";
            }
            info += name;
        }
        info += " is " + currentRoom.getFullDescription();
        return info;
    }
}
