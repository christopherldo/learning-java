package variables;

public class Variables {
    public Variables() {
        System.out.println("#3 - Variables");
    }

    public void name() {
        String name = "Alex";
        System.out.println("Hello, "  + name);

        name = "Cristian";
        System.out.println("Hello, " + name);
    }

    public void age() {
        String name = "Alex";
        int number = 23;
        System.out.println("Hello, " + name + ". Your age is: " + number);
    }
}
