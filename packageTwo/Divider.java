package packageTwo;

public class Divider extends WritingMaterials{
    private String dividerType;
    private boolean metal;

    public Divider() {
        super.draw=true;
    }

    public Divider(String dividerType, boolean metal) {
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public void draw_circle(){
        System.out.println("Drawn circle");
    }
}
