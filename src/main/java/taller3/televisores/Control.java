package taller3.televisores;

public class Control {
    private Tv tv;

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
    }

    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }

    public void getTV(){
        return this.tv;
    }

    public void setTv(Tv tv){
        this.tv = tv;
    }

}