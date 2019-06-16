package Aufgabe_3;

public class Main {

    public static void main(String[] args) {
	    var stack = new Stack<String>();
	    stack.push("Apfel");
	    stack.push("Orange");
	    System.out.println(stack.pop());
	    stack.push("Erdbeere");
	    stack.push("Kiwi");
	    System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
