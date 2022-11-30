package hillelHW004part2;

public class Player  {

    private String name;
    private int maxRun;
    private int maxJump;

    public  void run(){
        System.out.println("run");
    }
    public  void jump(){
        System.out.println("jump");
    }
    public Player(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }
}
