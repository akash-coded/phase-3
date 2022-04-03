package design_patterns;

class RegularClass {
    int data = 10; // instance variable

    @Override
    public String toString() {
        return "RegularClass [data=" + data + "]";
    }
}

class SingletonClass {
    int data = 50;
    private static SingletonClass instance = null;

    private SingletonClass() {
    }

    @Override
    public String toString() {
        return "SingletonClass [data=" + data + "]";
    }

    public static SingletonClass getInstance() {
        if (instance == null) { // no active object
            instance = new SingletonClass();
        }

        return instance;
    }
}

public class SingletonDemo {
    int outerNum = 100; // instance variable
    static double outerDouble = 200; // class variable

    public static void main(String[] args) {
        int localNum = 20; // local variable

        System.out.println("Demonstrating RegularClass::");
        RegularClass regularObj1 = new RegularClass();
        RegularClass regularObj2 = new RegularClass();
        System.out.println("Address of regularObj1: " + regularObj1.hashCode());
        System.out.println("Address of regularObj2: " + regularObj2.hashCode());
        System.out.println(regularObj1);
        System.out.println(regularObj2);
        regularObj1.data = 20;
        System.out.println(regularObj1);
        System.out.println(regularObj2);
        System.out.println();

        System.out.println("Demonstrating SingletonClass::");
        SingletonClass singletonObj1 = SingletonClass.getInstance();
        SingletonClass singletonObj2 = SingletonClass.getInstance();
        System.out.println("Address of singletonObj1: " + singletonObj1.hashCode());
        System.out.println("Address of singletonObj2: " + singletonObj2.hashCode());
        singletonObj1.data = 70;
        System.out.println(singletonObj1);
        System.out.println(singletonObj2);
    }
}