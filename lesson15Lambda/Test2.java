package lesson15Lambda;

public class Test2 {
    void def(I i) {
        System.out.println(i.abc());
    }

    void def(II i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        Test2 testic = new Test2();
        testic.def(() -> 155);
        testic.def(() -> "hello world");
    }
}

interface I {
    int abc();
}

interface II {
    String abc();
}
