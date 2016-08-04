/**
 * Created by husiq on 7/12/2016.
 */
import java.util.Scanner;
public class printLearn {
    private static Scanner input;
    public static void main(String[] args){
        input = new Scanner(System.in);
        System.out.print("你刚才输入的："+input.nextLine());
        String name = "张三";
        int age = 26;
        System.out.print("name:" + name +";age:"+age);
//        System.out.print("name: %s ; age: %d" ,name,age);
    }
}
