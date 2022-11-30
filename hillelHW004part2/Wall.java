package hillelHW004part2;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }


    public void overcome(int maxRun, int maxJump) {

        if (maxJump >= height){
            System.out.println("overcome wall");
        } else {
            System.out.println("can`t overcome wall");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
