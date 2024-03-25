package BehaviouralDesignPattern.CommandPattern;

public class VolumeUpCommand implements Command {
    Television television;
    VolumeUpCommand(Television television){
        this.television=television;
    }

    @Override
    public void execute() {
        television.turnTVVolumeUp();
    }

    @Override
    public void undo() {
        television.turnTVVolumeDown();
    }
    
}
