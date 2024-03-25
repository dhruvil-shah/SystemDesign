package BehaviouralDesignPattern.CommandPattern;

//Reciever
public class Television {
    private int voulme=0;
    private boolean tvOn;
    public void turnTVOn(){
        tvOn=true;
        System.out.println("TV State - "+tvOn);
    }
    public void turnTVOff(){
        tvOn=false;
        System.out.println("TV State - "+tvOn);
    }
    public void turnTVVolumeUp(){
        voulme++;
        System.out.println("Current Volume - "+voulme);
    }
    public void turnTVVolumeDown(){
        voulme=Math.max(voulme-1,0);
        System.out.println("Current Volume - "+voulme);
    }
}
