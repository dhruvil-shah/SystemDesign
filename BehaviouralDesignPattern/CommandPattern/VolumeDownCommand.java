package BehaviouralDesignPattern.CommandPattern;

public class VolumeDownCommand implements Command {
    Television television;
    VolumeDownCommand(Television television){
        this.television=television;
    }

    @Override
    public void execute() {
        television.turnTVVolumeDown();
    }

    @Override
    public void undo() {
        television.turnTVVolumeUp();
    }
    
}
