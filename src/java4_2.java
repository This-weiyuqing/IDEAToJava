
public class java4_2 {
    //用星号打印三角塔形
    public static void main(String[] args) {
        int lineCount = 9;
        int maxLineNum=(lineCount+1)/2;
//        正三角形星号
        for (int i = 1; i < maxLineNum ; i++) {
            //添加空格
            for (int space = 0; space < maxLineNum ; space++) {
                System.out.printf(" ");
            }
            //添加星号
            for (int star = 0; star < (i*2)-1; star++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        int declineCount = lineCount - maxLineNum;
        //倒三角型星号
        for (int i = 1; i < declineCount; i++) {
            for (int space = 1; space <=i ; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <(declineCount-i+1)*2-1 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
