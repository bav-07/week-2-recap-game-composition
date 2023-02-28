import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    // instantiate means 'make an instance of'
    // instantiating a class means making an object from it
    // The Main class is usually a 'singleton' (design pattern), which means that you would normally only make on instance.
    // 'Refactor' means to change your code around to make it more readable, more efficient, or to improve its structure.
    // UML and pseudocode allow you to reduce cognitive load by breaking down tasks

    // Properties are variables belonging to objects
    // a static property would only belong to the class
    private Player player;
    private Room currentRoom;
    private List<Room> rooms;
    private static int score;

    // a function is a reusable chunk of code
    // a method is a function that belongs to an object or a class
    // a static method belongs to the class, all other methods belong to the object

    // parameter vs argument?
    // parameters are variables that we use to capture information that we pass into the method/constructor
    // Properties are variables belonging to classes
    // parameters are the variables that are required to perform the function
    public Game(Player player){
        this.player = player;
        //System.out.println("Change name to George?: " + this.player.setName("George","supersecretpassword1"));
    }

    // This static method belongs to the Game class, so it can be instantiated before making any objects
    public static void main(String[] args) {
        // making just one instance of a class is called a singleton
        // when you pass a value into a method, that's an "argument"
        Game game = new Game(new Player("Jack"));
        /* System.out.println(game.player);
        Game.score = 50;*/

        game.rooms = new ArrayList<>();
        // Variable extract refactor
        Room corridor = new Room("Corridor",
                "You're in the spooky corridor. There's an unsavoury spider eyeing you",
                null);
        Room closet = new Room("Closet",
                "A small, dark closet, with a baseball bat",
                List.of(corridor));
        Room kitchen = new Room("Kitchen",
                "This kitchen contains a yummy sandwich",
                List.of(corridor));
        corridor.addRoom(closet);
        corridor.addRoom(kitchen);
        game.rooms.addAll(List.of(corridor, closet, kitchen));
        System.out.println(game.rooms);
    }

}
