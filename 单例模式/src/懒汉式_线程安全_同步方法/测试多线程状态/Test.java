package 懒汉式_线程安全_同步方法.测试多线程状态;

/**
 * 通过哈希值可以判断是否为同一对象
 */

import 懒汉式_线程安全_同步方法.Singleton;

public class Test {
    public static void main(String[] arge){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton=Singleton.getInstance_1();
                System.out.println("同步代码方法："+singleton);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton=Singleton.getInstance_1();
                System.out.println("同步代码方法："+singleton);
            }
        }).start();
    }
}
