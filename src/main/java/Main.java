import java.util.Scanner;

public class Main implements ExecuteMove {
    static int count=0;
    public static void main(String[] args) {
        Carlson carlson= new Carlson("Carlson", Condition.SITS);
        Fireplace fireplace= new Fireplace(TypeOfItem.ORIGINOFLIGHT, "Fireplace", Place.BOTTOM);
        Lamp lamp= new Lamp(TypeOfItem.ORIGINOFLIGHT, "Lamp", Place.TOP);
        Room room= new Room(Condition.LIGTH);
        Items items= new Items(TypeOfItem.NEUTRAL,"Items", Place.WORKBENCH);
        Scanner in= new Scanner(System.in);
        Workbench workbench= new Workbench(TypeOfItem.NEUTRAL, "Workbench");
        while (true){
            Main main= new Main();
            String stroka= in.nextLine();
            switch (stroka) {
                case ("wait"): {
                    count++;
                    main.Exwait(lamp, fireplace, room);
                    break;
                }
                case ("add log"): {
                    count++;
                    main.ExAddLog(lamp, carlson, fireplace, room);
                    break;
                }
                case("turn on lamp"):{
                    count++;
                    main.ExTurnUn(lamp, fireplace, room);
                    break;
                }
                case("get up"):{
                    count++;
                    main.ExGetUp(lamp,carlson, fireplace, room);
                    break;
                }
                case("get down"):{
                    count++;
                    main.ExHetDown(lamp,carlson, fireplace, room);
                    break;
                }
            }
            if (stroka.equals("break")){
                System.exit(0);
            }
        }
    }

    @Override
    public void Exwait(Lamp lamp, Fireplace fireplace, Room room) {
        Move move= new Move();
        move.Movewait(lamp, fireplace, room);
    }

    @Override
    public void ExAddLog(Lamp lamp, Carlson carlson, Fireplace fireplace, Room room) {
        Move move= new Move();
        move.MoveAddLog(lamp, carlson, fireplace, room);
    }

    @Override
    public void ExTurnUn(Lamp lamp, Fireplace fireplace, Room room) {
        Move move= new Move();
        move.MoveTurnUn(lamp, fireplace, room);
    }

    @Override
    public void ExGetUp(Lamp lamp,Carlson carlson, Fireplace fireplace, Room room) {
        Move move= new Move();
        move.MoveGetUp(lamp,carlson, fireplace, room);
    }

    @Override
    public void ExHetDown(Lamp lamp,Carlson carlson, Fireplace fireplace, Room room) {
        Move move= new Move();
        move.MoveHetDown(lamp,carlson, fireplace, room);
    }
}
