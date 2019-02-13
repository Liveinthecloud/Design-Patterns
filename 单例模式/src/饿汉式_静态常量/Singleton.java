package 饿汉式_静态常量;

/**
 * 优点：写法简单，可以避免线程同步的问题
 * 缺点：如果从始至终都未成使用过这个实例类，则会造成内存浪费。
 */

public class Singleton {
    //创建实例
    private final static Singleton INSTANCE= new Singleton();

    public Singleton(){}
    private static  Singleton getInstance(){
        return INSTANCE;
    }
}
