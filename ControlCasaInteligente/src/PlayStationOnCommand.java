

public class PlayStationOnCommand implements Command{
    PlayStation ps5;

    public PlayStationOnCommand (PlayStation ps5){
        this.ps5 = ps5;
    }

    public void execute(){
        ps5.on();
    }

    public void undo(){
        ps5.off();
    }
}
