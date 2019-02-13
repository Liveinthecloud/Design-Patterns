package 懒汉式_线程不安全.测试多线程状态;

import 懒汉式_线程不安全.Singleton;

/**
 * 通过哈希值可以判断是否为同一对象
 */
public class Test {
    public static void main(String[] arge){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton=Singleton.getInstance();
                System.out.println(singleton);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton=Singleton.getInstance();
                System.out.println(singleton);
            }
        }).start();
    }
}
