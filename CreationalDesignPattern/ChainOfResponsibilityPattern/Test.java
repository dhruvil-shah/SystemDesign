package CreationalDesignPattern.ChainOfResponsibilityPattern;

public class Test {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLog(new DebugLog(new ErrorLog(null)));

        logProcessor.log(LogProcessor.INFO, "Info Log");
        logProcessor.log(LogProcessor.DEBUG, "Debug Log");
        logProcessor.log(LogProcessor.ERROR, "Error Log");
    }
}
