/*
 * 1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

Click me to see the solution

2. Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".

Click me to see the solution

3. Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.

Click me to see the solution

4. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

Click me to see the solution

5. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods. 
 */

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private int radius;

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Area();
    }
    Circle(){
        radius = 1;
    }

    public double Area(){
       return (2*Math.PI*radius);
    }

}


public class interfacePractice {
    public static void main(String[] args) {
        Circle c = new Circle();
        double r=c.getArea();
        System.out.println(r);
    }
}
