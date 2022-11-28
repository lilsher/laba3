abstract class Item {
    TypeOfItem typeOfItem;
    String name;

    public Item(TypeOfItem typeOfItem, String name) {
        this.typeOfItem = typeOfItem;
        this.name = name;
    }

    public TypeOfItem getTypeOfItem() {
        return typeOfItem;
    }

    public String getName() {
        return name;
    }
}
