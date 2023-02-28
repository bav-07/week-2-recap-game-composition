import java.util.List;

public class Player {
    // making properties private, and using public getters and setters gives the class control over who can access and/or modify the state/data
    private String name;
    private String password = "supersecretpassword1";
    private List<Item> items;

    // The variables we put into the Player constructor are parameters
    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String setName(String name, String password){
        if(password.equals(this.password)) {
            this.name = name;
        }
        return this.name;
    }

    public List<Item> getItems(){
        return this.items;
    }

    public void setItems(List<Item> items){
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", items=" + items +
                '}';
    }
}
