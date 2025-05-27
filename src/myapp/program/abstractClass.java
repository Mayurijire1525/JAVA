package myapp.program;

abstract class Animal {
    abstract void sound(); 
    
    void sleep() {
    	System.out.println("Animal sleep");
    }
}


class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void sleep() {
    	System.out.println("Dog sleep");
    }
}
public class abstractClass {

	public static void main(String[] args) {
		Dog mydog=new Dog();
		mydog.sound();
		mydog.sleep();
		

	}

}
