public class Lamp extends Item{
    Place place;
    Condition condition;
    public Lamp(TypeOfItem typeOfItem, String name, Place place) {
        super(typeOfItem, name);
        this.place = place;
        this.condition=Condition.DOESNOTWORk;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }
}
