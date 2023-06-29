package packageTwo;

public class Bird extends Animal{
    String area = "at home";
    boolean winterFly;

    public Bird(String area, boolean winterFly) {
        super.isFly=true;
        this.area = area;
        this.winterFly = winterFly;
    }

    public Bird(){
        super();
        super.type= "Bird" ;
        super.isFly=true;
    }

    @Override
    public void display() {
        System.out.println("I am " + type + " " + name + " " + age + " "
                + weight + " " + isFly + " Live in " + area + " Fly in winter " + winterFly );

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public void chirick_chirick(){
        System.out.println("Chirick-Chirick");
    }
}
