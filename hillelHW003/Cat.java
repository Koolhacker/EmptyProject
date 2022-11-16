package hillelHW003;

public class Cat extends Animals {

    public int limitForRun = 200;
    public int limitForSwim = 0;

    static int numbersOfCat;

    Cat(){
        numbersOfCat++;
    }

    @Override
    public int getLimitForRun() {
        return limitForRun;
    }

    @Override
    public void setLimitForRun(int limitForRun) {
        this.limitForRun = limitForRun;
    }

    @Override
    public int getLimitForSwim() {
        return limitForSwim;
    }

    @Override
    public void setLimitForSwim(int limitForSwim) {
        this.limitForSwim = limitForSwim;
    }
}