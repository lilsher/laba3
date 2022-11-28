import java.util.ArrayList;

public class Carlson extends Person{
    ArrayList<Item> list= new ArrayList<>();
    public Carlson(String name, Condition condition) {
        super(name, condition);
        this.list.add(new Log(TypeOfItem.FUEL, "Log"));
        this.list.add(new Log(TypeOfItem.FUEL, "Log"));
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Condition getCondition() {
        return super.getCondition();
    }

    @Override
    public void setCondition(Condition condition) {
        super.setCondition(condition);
    }
    void AddItem(Item item){
        this.list.add(item);
    }
    void Lost(Item item){
        this.list.remove(item);
    }
}
