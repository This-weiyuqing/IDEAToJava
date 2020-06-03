package DAY1;

/*
与   &&  同对为对
或   ||  二选一满足
非   !   否定
有成立中止功能，即前部分不成立或成立，就不会看后部分
只能用于boolen值
        */
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(3 < 4 && 10 > 5);
        System.out.println("         ");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println("        ");
        System.out.println(true);
        System.out.println(!true);
        System.out.println("    ");
        int a=10;
        System.out.println(3>4&&++a<100);
        System.out.println(a);
        int b=20;
        System.out.println(3<4||++b<100);
        System.out.println(b);

    }
}
