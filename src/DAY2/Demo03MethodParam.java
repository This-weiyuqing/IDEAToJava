package DAY2;

/*
有参
    需要传递进去的数据
无参
    不需要传递进入数据

有返回值一定要return一下。不然会return报错
    没有返回值要写void
    return的返回值类型要与方法的保持一致
    void要写return，return之后不能写返回值，该return作用为结束
方法体里最后一行的return可以省略不写

* */
public class Demo03MethodParam {
    public static void main(String[] args) {
        System.out.println(Max(3,5));
    }
    public static int Max(int a,int b){
        return a>b?a:b;
    }
}
