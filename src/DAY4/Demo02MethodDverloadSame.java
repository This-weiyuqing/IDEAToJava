package DAY4;
/*判断两个数据是否相等*/
public class Demo02MethodDverloadSame {
    public static void main(String[] args) {
        byte a=20;
        byte b=5;
        System.out.println(isSame(a,b));
        System.out.println(isSame((int)20,(int)20));

    }
    public static boolean isSame(byte a,byte b){
        boolean same;
        System.out.println("byte");
        if (a == b) {
            same=true;

        }else {
            same=false;
        }return same;
    }
    public static boolean isSame(int a,int b){
        boolean same;
        System.out.println("int");
        if (a == b) {
            same=true;

        }else {
            same=false;
        }return same;
    }
    public static boolean isSame(short a,short b){
        boolean same;
        System.out.println("short");
        if (a == b) {
            same=true;

        }else {
            same=false;
        }return same;
    }

    public static boolean isSame(long a,long b){
        boolean same;
        System.out.println("long");
        if (a == b) {
            same=true;

        }else {
            same=false;
        }return same;
    }
}
