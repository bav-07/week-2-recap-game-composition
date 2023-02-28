public class NPC {

    private String name;
    private String description;
    private Item unlockItem;

    public NPC(String name, String description){
        this.name = name;
        this.description = description;

    }

    public void setUnlockItem(Item item){
        unlockItem = item;
    }

    public Item getUnlockItem(){
        return unlockItem;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

}
