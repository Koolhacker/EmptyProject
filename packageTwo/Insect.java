package packageTwo;

public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;

    public Insect() {
        super.isWalk=true;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void ggggg(){
        System.out.println("Ggggg");
    }
}
