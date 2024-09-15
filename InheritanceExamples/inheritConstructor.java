package InheritanceExamples;

class Child {
    public Child() {
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grandchild constructor");
    }
}

class Parent {
    // parameter constructor
    public Parent() {
        System.out.println("Parent non_para constructor");
    }

    public Parent(String x) {
        System.out.println("Parent constructor X:" + x);
    }

}

class Children extends Parent {
    // parameter constructor
    public Children() {
        System.out.println("Children non-para constructor");
    }

    public Children(String x,String y) {
        super(y); // new y parameter for parent
        System.out.println("Children constructor X:" + x);
    }
}

public class inheritConstructor {
    public static void main(String[] args) {
        // Child c = new Child();
        // 2 * constructor called child & grandchilds
        // GrandChild gc = new GrandChild();


        //---------------------------------------------
        // Parent p = new Parent();
        Children c = new Children("parameter","Parent parameter"); //calls normal parent constructor without super
    }
}
