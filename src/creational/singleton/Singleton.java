package creational.singleton;

public class Singleton {
    private Singleton(){


    }
    private static final class LazyLoader{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return LazyLoader.INSTANCE;
    }
}


// This Singleton Pattern works because it uses the Bill Pugh Singleton Design with a static nested helper class. Here’s why:
//        1.    Lazy Initialization: The LazyLoader class is loaded and initialized only when getInstance() is called for the first time, ensuring the Singleton instance is created only when needed.
//        2.   Thread-Safe: Java’s class-loading mechanism guarantees that the INSTANCE is initialized once and only once, even in a multi-threaded environment.
//        3.    No Synchronization Overhead: It avoids the performance cost of synchronization used in other creational.singleton implementations, as the class-loading mechanism handles thread safety.
//        4.   Efficient and Elegant: The implementation is concise, avoids boilerplate code, and ensures proper initialization and performance.
//
// This makes it a robust and recommended approach for implementing the Singleton Pattern in Java.

