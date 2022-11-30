package hillelHW004part2;

public class Cat extends Player {

    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }


    public  void jump() {
        System.out.println("cat jump");
    }


    public  void run() {
        System.out.println("cat run");
    }
}
