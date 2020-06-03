package DAY1;

public class Demo06Operator {
    public static void main(String[] args) {
        //自增自减
        int num1 = 10;
        ++num1;//++num和num++
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        System.out.println("----------------------");
        //混合使用
       /* 1.前置；
                先加后用*/
        int num2 = 20;
        System.out.println(++num2);
        System.out.println(num2);
        System.out.println("----------------------");
       /*2.后置
                先用后加*/
        int num3 = 30;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println("----------------------");

//        与赋值一起使用
        int num4 = 40;
        int result1 = --num4;
        System.out.println(result1);
        System.out.println(num4);
        System.out.println("----------------------");

        int num5=50;
        int result2=num5--;
        System.out.println(result2);
        System.out.println(num5);
        System.out.println("----------------------");

        int x=10;
        int y=20;
        int result3=++x+y--;
        System.out.println(result3);
        System.out.println(x);
        System.out.println(y);
        System.out.println("----------------------");
    }
}
