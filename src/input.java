import java.util.Scanner;//表示把java.util下的Scanner类导入
public class input {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");

        //当程序执行到 next 方法时，会等待用户输入~~~
        String name = myScanner.next(); //接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt(); //接收用户输入int
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble(); //接收用户输入double
        System.out.println("人的信息如下:");
        System.out.println("名字=" + name
                + " 年龄=" + age + " 薪水=" + sal);
    }
}
