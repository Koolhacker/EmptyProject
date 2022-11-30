package hillelHW004part2;

public class Android extends Player {

    public Android(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }


    public  void jump() {
        System.out.println("android jump");
    }


    public  void run() {
        System.out.println("android run");
    }
}
