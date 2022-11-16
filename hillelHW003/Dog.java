package hillelHW003;

public class Dog extends Animals {

    private int limitForRun = 500;
    private int limitForSwim = 10;

    static int numbersOfDog;
    Dog(){
        numbersOfDog++;
    }
    public int getLimitForRun() {
        return limitForRun;
    }

    public void setLimitForRun(int limitForRun) {
        this.limitForRun = limitForRun;
    }

    public int getLimitForSwim() {
        return limitForSwim;
    }

    public void setLimitForSwim(int limitForSwim) {
        this.limitForSwim = limitForSwim;
    }
}
