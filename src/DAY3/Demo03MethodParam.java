package DAY3;
/*方法定义在类中，但是不能在方法里定义方法
* 前后顺序无所谓
* 需要调用才会执行
* 有返回值需要返回，且返回值类型要与返回值相同
* 对于void方法，return后不能加返回值，会报错
* 同时只能有一个return被执行到*/
public class Demo03MethodParam {
    public static void main(String[] args) {

    }
    public static int method01(){
        return 01;
    }
    public static void method02(){
//        return 10;void声明不能加返回值
        return;
    }
}
