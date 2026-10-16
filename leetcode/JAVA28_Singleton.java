/*
 * JAVA28 创建单例对象
 * 状态：参考讲解完成，暂未完全理解，待复习。
 *
 * 题目要求：多次调用 getInstance()，返回同一个对象。
 *
 * 当前疑问：
 * 1. 类里面为什么能声明自身类型的字段？
 * 2. 方法返回对象的引用，具体怎么理解？
 * 3. 为什么要通过方法获取对象？
 */

public class JAVA28_Singleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // 本题不考虑线程安全
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
