public interface ActionsWithItems {
    void SetCondtionLamp(Lamp lamp);
    void SetCondtionFiraplace(Fireplace fireplace);
    void SetConditionCarloson(Carlson carlson);
    void ExAddFuel(Carlson carlson, Fireplace fireplace);

    void Check(Lamp lamp, Fireplace fireplace, Room room);
}
