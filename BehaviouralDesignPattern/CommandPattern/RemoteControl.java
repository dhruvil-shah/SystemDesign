package BehaviouralDesignPattern.CommandPattern;

import java.util.Stack;

//Invoker
public class RemoteControl {
    Command command;
    Stack<Command> commandsList;
    RemoteControl(){
        commandsList = new Stack<>();
    }
    public void setCommand(Command command){
        this.command=command;
        commandsList.push(command);
    }
    public void pressButton(){
        command.execute();
    }
    public void undoCommand(){
        if (!commandsList.isEmpty()) {
            Command cuurentCommand = commandsList.pop();
            cuurentCommand.undo();
        }
    }
}
