package CreationalDesignPattern.ChainOfResponsibilityPattern;

public class InfoLog extends LogProcessor {

    InfoLog(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int infoLevel,String message){
        if (infoLevel==INFO) {
            System.out.println(message);
        }else{
            super.log(infoLevel, message);
        }
    }
}
