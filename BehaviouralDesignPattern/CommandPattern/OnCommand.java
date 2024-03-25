package BehaviouralDesignPattern.CommandPattern;

public class OnCommand implements Command {
    Television television;
    OnCommand(Television television){
        this.television=television;
    }
    @Override
    public void execute() {
        television.turnTVOn();
    }

    @Override
    public void undo() {
        television.turnTVOff();
    }
    
}
