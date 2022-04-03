package relationships;

class Dependency { // POJO class
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Container {
    // A class having the object reference of another class as a
    // data member is called a dependency for the container class
    Dependency dependency; // dependency

    public Container() {
    }

    public Container(Dependency dependency) {
        this.dependency = dependency;
    }

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}

public class DependencyDemo {
    public static void main(String[] args) {
        Dependency dependency = new Dependency(); // created by the programmer
        // The process of providng an object for a dependency
        // of a class is called dependency resolution

        // Dependency resolution can be done in 3 ways
        Container container = new Container(dependency); // Constructor resolution
        container.dependency = dependency; // Field resolution
        container.setDependency(dependency); // Setter resolution
    }
}
