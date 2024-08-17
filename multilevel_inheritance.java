class M {
    int x = 10;

    M() {
        System.out.println("constructor of M");
    }

    void disM() {
        System.out.println("method of M " + x);
    }
}

class F extends M {
    int x = 20;

    F() {
        System.out.println("constructor of F");
    }

    void disF() {
        System.out.println("method of F " + x);
    }
}

class C extends F {
    int x = 30;

    C() {
        System.out.println("constructor of C");
    }

    public void disC() {
        System.out.println("method of C " + x);
    }
}

class D extends C {
    int x = 40;

    D() {
        System.out.println("constructor of D");
    }

    void disD() {
        System.out.println("method of D " + x);
        disC();
        // super.disD();
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        D d = new D();
        d.disD();
        d.disC();
        d.disF();
        d.disM();
    }
}
