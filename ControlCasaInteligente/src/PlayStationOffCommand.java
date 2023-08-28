

public class PlayStationOffCommand implements Command{
    PlayStation ps5;

    public PlayStationOffCommand (PlayStation ps5){
        this.ps5 = ps5;
    }

    public void execute(){
        ps5.off();
    }

    public void undo(){
        ps5.on();
    }
}
