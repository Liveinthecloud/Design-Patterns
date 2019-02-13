package 静态内部类;

/**
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，
 * 没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，
 * 调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 *
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
public class Singleton {
    private Singleton(){}
    //静态内部类
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
