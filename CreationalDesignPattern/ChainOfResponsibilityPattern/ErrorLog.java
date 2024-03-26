package CreationalDesignPattern.ChainOfResponsibilityPattern;

public class ErrorLog extends LogProcessor{
    ErrorLog(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int infoLevel,String message){
        if (infoLevel==ERROR) {
            System.out.println(message);
        }else{
            super.log(infoLevel, message);
        }
    }
}
