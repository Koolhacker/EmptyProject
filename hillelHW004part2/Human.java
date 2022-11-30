package hillelHW004part2;

public class Human extends Player {

    public Human(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }


    public  void jump() {
        System.out.println("human jump");
    }


    public  void run() {
        System.out.println("human run");
    }
}
