package BehaviouralDesignPattern.CommandPattern;

public class Test {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new OnCommand(television));
        remoteControl.pressButton();

        remoteControl.setCommand(new VolumeUpCommand(television));
        remoteControl.pressButton();
        remoteControl.undoCommand();
        
        remoteControl.setCommand(new VolumeDownCommand(television));
        remoteControl.pressButton();

        remoteControl.setCommand(new OffComand(television));
        remoteControl.pressButton();
        remoteControl.undoCommand();
        
        
    }
}
