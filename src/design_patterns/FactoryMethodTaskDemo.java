package design_patterns;

interface MyWrapper {
    void printType();
}

class MyInteger implements MyWrapper {
    public void printType() {
        System.out.println("The value is of type MyInteger");
    }
}

class MyWrapperFactory {
    public MyWrapper getMyWrapperInstance(String value) {
        // checking for MyInteger
        boolean notADigitFlag = false;
        for (int i = 0; i < value.length(); i++) {
            if (value.codePointAt(i) < 48 || value.codePointAt(i) > 57) {
                notADigitFlag = true;
                break;
            }
        }
        if (!notADigitFlag) {
            return new MyInteger();
        }

        // check for MyDouble

        // check for MyBoolean

        // check for MyCharacter

        // in case the value is not one of the four types
        throw new IllegalArgumentException("Not an integer");
    }
}

public class FactoryMethodTaskDemo {
    public static void main(String[] args) {
        MyWrapperFactory factory = new MyWrapperFactory();

        MyWrapper obj = factory.getMyWrapperInstance("234.56");
        obj.printType();
    }
}
