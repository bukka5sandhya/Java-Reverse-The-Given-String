import java.util.Scanner;
public class ReverseTheString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = "Welcome to VS Code";
        String[] strArray = str.split(" ");
        for(String temp: strArray){
            System.out.println(temp);
        }
        for(int i=0;i<4;i++){
            char[] str1 = strArray[i].toCharArray();
            for(int j=str1.length-1;j >=0 ;j--){
                System.out.print(str1[j]);
            }
            System.out.print(" ");
        }
    }
}