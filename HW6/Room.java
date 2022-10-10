public class Room{
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room west;
    private Room east;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setNorth(Room n) {
        this.north = n;
    }
    public void setSouth(Room s) {
        this.south = s;
    }
    public void setWest(Room w) {
        this.west = w;
    }
    public void setEast(Room e) {
        this.east = e;
    }
    public void setExits(Room n, Room s, Room w, Room e) {
        this.north = n;
        this.south = s;
        this.west = w;
        this.east = e;

    }
    public Room getNorth(){
        return this.north;
    }
    public Room getSouth(){
        return this.south;
    }
    public Room getWest(){
        return this.west;
    }
    public Room getEast(){
        return this.east;
    }
    public String getDescription(){
        return this.description;
    }
    public String getName(){
        return this.name;
    }
    public String getExits(){
        String output = "";
        if(this.north != null){
            output += "North: " + this.north.getName() +"\n";
        }
        if(this.south != null){
            output += "South: " + this.south.getName() +"\n";
        }
        if(this.west != null){
            output += "West: " + this.west.getName() +"\n";
        }
        if(this.east != null){
            output += "East: " + this.east.getName() +"\n";
        }
        return output;
    }
    public String toString(){
        String output = "";
        output += this.description +"\n";
        if(this.north != null){
            output += "North: " + this.north.getDescription() +"\n";
        }
        if(this.south != null){
            output += "South: " + this.south.getDescription() +"\n";
        }
        if(this.west != null){
            output += "West: " + this.west.getDescription() +"\n";
        }
        if(this.east != null){
            output += "East: " + this.east.getDescription() +"\n";
        }
        return output;
    }
}