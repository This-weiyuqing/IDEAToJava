package DAY2;

/*方法

*参数
* 返回值
*定义格式：
修饰符 返回值类型 方法名称
    方法体
    return ;

修饰符：ps 简易修饰符
返回值类型：最终产生的结果类型  int double之类的
方法名称
参数类型 进入的类型
参数名称 名称
方法体
return 停止方法 将后面的返回值返回
    要与方法名称的返回值类型对应

* */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(1, 5);
        System.out.println(sum(1, 5));
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行");
        int c = a + b;
        return c;
    }
}
