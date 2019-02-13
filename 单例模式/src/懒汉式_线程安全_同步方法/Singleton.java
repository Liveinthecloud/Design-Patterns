package 懒汉式_线程安全_同步方法;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){}
    /**
     * 方法效率太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
     * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了
     */
    public static synchronized Singleton getInstance_1(){
        if(singleton == null){
            try {
                //模拟线程来不及实例化对象
                Thread.sleep(1000);
                singleton=new Singleton();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return singleton;
    }

    /**
     * 改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一致，
     * 假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
     * @return
     */
    public static Singleton getInstance_2(){
        if(singleton == null){
            try {
                //模拟线程来不及实例化对象
                Thread.sleep(1000);
                synchronized (Singleton.class) {
                    singleton=new Singleton();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return singleton;
    }
}



