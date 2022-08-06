package javaMentoring;

@FunctionalInterface
interface FunctionalInterfaceExample {
     public abstract void method();
     
     default void method1() {
    	 System.out.println("FunctionalInterface Default Method 1");
     }
     
     default void method2() {
    	 System.out.println("FunctionalInterface Default Method 2");
     }
     
     static void method3() {
    	 System.out.println("FunctionalInterface Static Method 3");
     }
}
