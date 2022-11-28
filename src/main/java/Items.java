public class Items extends Item{
    Place place;

    public Items(TypeOfItem typeOfItem, String name, Place place) {
        super(typeOfItem, name);
        this.place = place;
    }
}
