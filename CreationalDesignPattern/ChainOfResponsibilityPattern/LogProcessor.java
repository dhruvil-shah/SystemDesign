package CreationalDesignPattern.ChainOfResponsibilityPattern;

public class LogProcessor {
    public static final int INFO=1;
    public static final int DEBUG=2;
    public static final int ERROR=3;
    public LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor){
        nextLogProcessor=logProcessor;
    }
    public void log(int infoLevel, String message){
        if (nextLogProcessor!=null) {
            nextLogProcessor.log(infoLevel,message);
        }
    }
}
