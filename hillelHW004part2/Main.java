package hillelHW004part2;


public class Main {
    public static void main(String[] args) {

        Player[] player = {
                new Human("Ivan", 100, 2),
                new Human("Natasha", 80, 1),
                new Cat("Kosmos", 200, 1),
                new Cat("BorisZver", 300, 2),
                new Android("Termanator", 1000, 5),
                new Android("Robocop", 800, 3),

                new Player("Chudovishe", 2000, 10)
        };

        Obstacle[] obstacle = {
                new RunningTrack(100),
                new Wall(3)
        };

        for (int i = 0; i < player.length; i++) {

           System.out.println(player[i].getName());

           for (int j = 0; j < obstacle.length; j++) {
                obstacle[j].overcome(player[i].getMaxRun(),player[i].getMaxJump());

            }
        }
    }
}

