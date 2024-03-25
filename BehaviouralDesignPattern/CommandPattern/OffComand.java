package BehaviouralDesignPattern.CommandPattern;

public class OffComand implements Command {
    Television television;
    OffComand(Television television){
        this.television=television;
    }
    @Override
    public void execute() {
        television.turnTVOff();
    }

    @Override
    public void undo() {
        television.turnTVOn();
    }
    
}
