import java.util.Scanner;
public class next {
    public static void main(String[] args) {
//创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
//next方式接收字符串
        String str = scanner.next();
        System.out.println("输入内容："+str);
        scanner.close();
    }

}