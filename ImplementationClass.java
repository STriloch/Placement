
interface Interface1 {
   
    static void staticMethod1() {
        System.out.println("Static method in Interface1");
    }

    default void defaultMethod1() {
        System.out.println("Default method in Interface1");
    }

    void abstractMethod1();
}

interface Interface2 extends Interface1 {
    
    static void staticMethod2() {
        System.out.println("Static method in Interface2");
    }

  
    default void defaultMethod2() {
        System.out.println("Default method in Interface2");
    }

    
    void abstractMethod2();
}

class ImplementationClass implements Interface2 {
  
    public void abstractMethod1() {
        System.out.println("Abstract method1 implemented in ImplementationClass");
    }

    public void abstractMethod2() {
        System.out.println("Abstract method2 implemented in ImplementationClass");
    }

    public static void main(String[] args) {

        Interface1.staticMethod1();
        Interface2.staticMethod2();

        ImplementationClass obj = new ImplementationClass();

        obj.defaultMethod1();
        obj.defaultMethod2();

        obj.abstractMethod1();
        obj.abstractMethod2();
    }
}
