class A {
    int a, b, c;

    A() {
        System.out.println("default constructor");
    }

    A(int a) {
        this.a = a;
        System.out.println(a);
    }

    A(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + " " + b);
    }

    A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a + " " + b + " " + c);
    }
}

public class second {
    public static void main(String[] args) {
        new A();
        new A(10);
        new A(10, 20);
        new A(10, 20, 30);
    }
}