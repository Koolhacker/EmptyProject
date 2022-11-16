package hillelHW003;

public class Animals {

    private String name;
    private int length;
    private int limitForRun;
    private int limitForSwim;

    public void run(int length, int limitForRun) {
        if (length <= limitForRun)
            System.out.println(name +" run " + length + " m.");
        else
            System.out.println(name +" can`t run " + length + " m.");
    }

    public void swim(int length, int limitForSwim) {
        if (length <= limitForSwim)
            System.out.println(name +" swim " + length + " m.");
        else
            System.out.println(name +" can`t swim " + length + " m.");
    }




    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getLimitForRun() {
        return limitForRun;
    }

    public int getLimitForSwim() {
        return limitForSwim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLimitForRun(int limitForRun) {
        this.limitForRun = limitForRun;
    }

    public void setLimitForSwim(int limitForSwim) {
        this.limitForSwim = limitForSwim;
    }




}