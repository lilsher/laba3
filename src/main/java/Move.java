public class Move implements ActionsWithItems{
    void Movewait(Lamp lamp, Fireplace fireplace, Room room){
        Move move= new Move();
        move.Check(lamp, fireplace, room);
    };
    void MoveAddLog(Lamp lamp,Carlson carlson,Fireplace fireplace, Room room){
        Move move= new Move();
        move.Check(lamp, fireplace, room);
        move.ExAddFuel(carlson, fireplace);
    };
    void MoveTurnUn(Lamp lamp, Fireplace fireplace, Room room){
        Move move= new Move();
        move.SetCondtionLamp(lamp);
        move.Check(lamp, fireplace, room);
    };
    void MoveGetUp(Lamp lamp,Carlson carlson, Fireplace fireplace, Room room){
        Move move= new Move();
        move.Check(lamp, fireplace, room);
        move.SetConditionCarloson(carlson);
    };
    void MoveHetDown(Lamp lamp,Carlson carlson, Fireplace fireplace, Room room){
        Move move= new Move();
        move.Check(lamp, fireplace, room);
        move.SetConditionCarloson(carlson);
    };

    @Override
    public void SetCondtionLamp(Lamp lamp) {
        lamp.setCondition(Condition.WORKS);
    }

    @Override
    public void SetCondtionFiraplace(Fireplace fireplace) {
        if (fireplace.condition.hashCode()==Condition.WORKS.hashCode()){
            fireplace.condition=Condition.DOESNOTWORk;
        }
        else {
            fireplace.condition=Condition.WORKS;
        }
    }

    @Override
    public void SetConditionCarloson(Carlson carlson) {
        if (carlson.getCondition()==Condition.SITS){
            carlson.setCondition(Condition.COSTS);
        }
        else {
            carlson.setCondition(Condition.SITS);
        }
    }

    @Override
    public void ExAddFuel(Carlson carlson, Fireplace fireplace) {
        if (carlson.list.size()>0){
            fireplace.GetFuel(new Log(TypeOfItem.FUEL, "Log"));
            carlson.list.remove(0);
        }
        System.out.println(carlson.list.size());
    }

    @Override
    public void Check(Lamp lamp, Fireplace fireplace, Room room) {
        if (lamp.condition==Condition.DOESNOTWORk & fireplace.list.size()==0){
            room.setCondition(Condition.DARK);
            System.out.println("non work");
        }
        if (lamp.condition!=Condition.DOESNOTWORk || fireplace.list.size()!=0){
            room.setCondition(Condition.LIGTH);
            System.out.println("work");
        }
        if (fireplace.list.size()>0 & Main.count%2==0 & Main.count>0){
            fireplace.LostFuel();
        }
    }
}
