package packageTwo;

public class Animal {
    String type = "No type ", name = "No name ";
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animal() {

    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No name";
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        this.isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void display() {
        System.out.println(type + " " + name + " " + age + " "
                + weight + " " + isFly + " " + isWalk + " " + isSwim);
    }

    public void rename(String newName) {
        name = newName;
    }

    public void holiday() {

    }

    public void holiday(int day) {
        weight *= 0.1 * day;
    }

    public void holiday(double m) {
        weight *= 0.1 + m;
    }

    public void holiday(double m, int n) {
        weight *= 0.1 + (n * m);
    }

}

