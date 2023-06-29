package packageTwo;

public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    public Fish() {
        super.isSwim=true;
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul(){
        System.out.println("Bul-bul");
    }
}
