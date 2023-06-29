package packageTwo;

public class WritingMaterials {
    String name = "noName", color = "noColor";
    int price;
    double length;
    boolean draw;

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public WritingMaterials() {
    }
    public WritingMaterials(String name, String color) {
    }
    public WritingMaterials(String name,  int price) {
        this.color = "No color";
    }
    public WritingMaterials(int price, double length, boolean draw) {
        this.color = "No color";
        this.name = "No name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void display(){
        System.out.println("Name - " + name + " Color - " +  color + " Price -  " + price + " Can draw  - " + draw);
    }
    public void  replaceRod(String color){
        this.color = color;
    }
    public void priceUp(int price){
        this.price+=price;
    }
    public void priceDown(int price){
        this.price-=price;
    }

    public void draw(){
        if (draw){
            System.out.println(name + " draw line. her color is " + color);
        } else {
            System.out.println(name + " can`t draw anything");
        }
    }
    public void draw(int n){
        if (draw){
            System.out.println(name + " draw line " + n + " her color is " + color);
        } else {
            System.out.println(name + " can`t draw anything");
        }
    }
    public void draw(String color){
        if (draw){
            System.out.println(name + " draw line. her color is " + color);
        } else {
            System.out.println(name + " can`t draw anything");
        }
    }
    public void draw(String color, int n){
        if (draw){
            System.out.println(name + " draw line. her color is " + color);
        } else {
            System.out.println(name + " can`t draw anything");
        }
    }


    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}