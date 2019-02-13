package 懒汉式_线程不安全;

/**
 * 优点： 达到了Lazy Loading的效果，但是只能在单线程下使用。
 * 缺点：线程不安全，当一个线程进入if(singleton == null) 判断语句块，还未来得及向下执行。
 * 另一个线程也进入了判断语句中，就会产生多个实例。
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            try {
                //模拟线程来不及实例化对象
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton=new Singleton();
        }
        return singleton;
    }
}
