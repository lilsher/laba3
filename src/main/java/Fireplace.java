import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fireplace extends Item{
    ArrayList<Object> list = new ArrayList<>();
    Place place;
    Condition condition;
    public Fireplace(TypeOfItem typeOfItem, String name, Place place) {
        super(typeOfItem, name);
        this.list = list;
        this.place = place;
        this.list.add(new Log(TypeOfItem.FUEL, "Log"));
        this.condition=Condition.WORKS;
    }

    @Override
    public TypeOfItem getTypeOfItem() {
        return super.getTypeOfItem();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    void GetFuel(Item item){
        this.list.add(item);
    }
    void LostFuel(){
        this.list.remove(0);
    }
}
