package Codewars;

public class Grasshopper {
    public static void main(String[] args) {
        System.out.println(greet("Daniel", "Daniel"));
        System.out.println(greet("Greg", "Daniel"));

    }

    public static String greet(String name, String owner) {

        if (name.equals(owner)) {
            return "Hello boss";
        }
        return "Hello guest";
    }

    // return name.equals(owner) ? "Hello boss" : "Hello guest";
}
