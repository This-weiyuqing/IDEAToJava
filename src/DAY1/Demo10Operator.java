package DAY1;/*
运算符
    一元  ！ ++ --
    二元  + - / * % =
    三元

        三元格式： 变量名称=条件判断?表达式A:表达式B；

            先判断是否成立，成立用A
                          不成立用B
    通过条件判断选择执行的表达式
同时保证表达式符合数据类型要求

*/

public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        int max = a > b ? a : b;
        System.out.println(max);
    }
}
