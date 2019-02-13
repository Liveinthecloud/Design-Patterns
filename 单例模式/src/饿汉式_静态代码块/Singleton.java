package 饿汉式_静态代码块;

/**
 * 类似于静态常量
 */
public class Singleton {
    private static Singleton instance;
    static{
        instance=new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
