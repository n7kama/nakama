import java.util.*;
public class Composition{

    public static Room moveNewRoom(String choice, Room currentRoom){
        switch (choice){
            case "n":
                
                if (currentRoom.getNorth() != null){
                    currentRoom = currentRoom.getNorth();
                    return currentRoom;
                }
                else{
                    System.out.println("No Room There!");
                }
                    break;
            case "s":
                
                if (currentRoom.getSouth() != null){
                    currentRoom = currentRoom.getSouth();
                    return currentRoom;
                }
                else{
                    System.out.println("No Room There!");
                }
                    break;
             case "w":
                
                if (currentRoom.getWest() != null){
                    currentRoom = currentRoom.getWest();
                    return currentRoom;
                }
                else{
                    System.out.println("No Room There!");
                }
                    break;
             case "e":
                
                if (currentRoom.getEast() != null){
                    currentRoom = currentRoom.getEast();
                    return currentRoom;
                }
                else{
                    System.out.println("No Room There!");
                }
                    break;

            
            
            }   
            return currentRoom;
        }
    
    
    public static void main (String[] args){
        System.out.println("Welcom to my Dungeon!");
        Scanner input = new Scanner(System.in);
        boolean play = true;
        Dungeon d1 = new Dungeon();
        Room currentRoom = d1.getStartRoom();
        System.out.println(currentRoom.getDescription());
        System.out.println("Type n to go north, type s to go south, type w to go west, type e to go east");
        while(play==true){
            String choice = input.nextLine();
            if(choice.equals("q")){
                play = false;
            }
            else{
                currentRoom = moveNewRoom(choice,currentRoom);
                System.out.println(currentRoom.getDescription());
                System.out.println(currentRoom.getExits());
                
            }
        }
        System.out.println("Thank you for playing! Bye!");
                

    }
}