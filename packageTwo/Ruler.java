package packageTwo;

public class Ruler extends WritingMaterials{
    private double length;
    private boolean wood;

    public Ruler() {
        super.draw=false;
    }

    public Ruler(double length, boolean wood) {
        this.length = length;
        this.wood = wood;
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public void measure(){
        System.out.println("Now measure length");
    }

}
