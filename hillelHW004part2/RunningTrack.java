package hillelHW004part2;

public class RunningTrack extends Obstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(int maxRun, int maxJump) {

        if (maxRun >= length){
            System.out.println("overcome running track at distance " + length + "m.");
        } else {
            System.out.println("can`t overcome running track at distance " + length + "m."   +
                    " Could only " + maxRun + "m.");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
