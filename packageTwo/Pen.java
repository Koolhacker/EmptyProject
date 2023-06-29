package packageTwo;

public class Pen extends WritingMaterials{
    private int countColor=1;
    private boolean auto;
    private String nameOfClass="Pen";

    public Pen() {
        super.draw=true;
    }

    public Pen(int countColor, boolean auto) {
        this.countColor = countColor;
        this.auto = auto;
    }

    public void writeMyName(){
        System.out.println("name");
    }

    @Override
    public void display() {
        System.out.println("This is " + nameOfClass + " Name - " + name + " Color - " +  color + " Price -  " + price + " Can draw  - " + draw);

    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
}
