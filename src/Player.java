public class Player {
    private String name;
    private Room currentRoom;

    public Player(String name) {
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

    public boolean take(String itemName) {

        return false;
    }

    public String getInfo() {
        return name + " is " + currentRoom.getFullDescription();
    }
}
