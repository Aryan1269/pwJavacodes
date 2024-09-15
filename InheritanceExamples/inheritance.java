package InheritanceExamples;

class parent {
    public void Parent() {
        System.out.println("super class");
    }

    public void nothing() {
        System.out.println("this is nothing to be override");
    }
}

class child extends parent {
    public void Child() {
        System.out.println("this is child");
    }

    @Override
    public void nothing() {
        System.out.println("this is override");
    } 
    
    public void normal() {
        System.out.println("this is child class meth");
    }

}

public class inheritance {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();

       

        //************Dynamic dispach method*** only override calls(parent) ***************/

        parent p1 = new child();
        child c1 = new child();

        p1.nothing();
        p1.Parent();
        c1.normal();
    }
}
