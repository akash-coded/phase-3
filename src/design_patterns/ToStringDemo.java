package design_patterns;

class ClassWithDefaultToString {
    int data = 10;
    static int staticData = 20;
}

class ClassWithOverriddenToString {
    int data = 10;

    @Override
    public String toString() {
        return "Regular [data=" + data + "]";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        ClassWithDefaultToString objWithDefaultToString = new ClassWithDefaultToString();
        System.out.println(objWithDefaultToString);
        System.out.println(objWithDefaultToString.getClass().getSuperclass().getSimpleName());
        System.out.println();

        ClassWithOverriddenToString objWithCustomToString = new ClassWithOverriddenToString();
        System.out.println(objWithCustomToString);
    }
}
