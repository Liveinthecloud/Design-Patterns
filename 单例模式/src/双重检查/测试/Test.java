package 双重检查.测试;

import 双重检查.Singleton;

public class Test {
    public static void main(String[] arge) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("A:" + singleton);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("B:" + singleton);
            }
        }).start();
    }
}
