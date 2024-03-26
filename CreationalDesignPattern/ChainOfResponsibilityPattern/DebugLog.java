package CreationalDesignPattern.ChainOfResponsibilityPattern;

public class DebugLog extends LogProcessor {
    DebugLog(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int infoLevel,String message){
        if (infoLevel==DEBUG) {
            System.out.println(message);
        }else{
            super.log(infoLevel, message);
        }
    }
}
