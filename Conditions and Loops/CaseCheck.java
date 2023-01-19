import java.util.Scanner;

import javax.xml.transform.Source;
public class CaseCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String word="hello";
        // System.out.println(word.charAt(4)); //charAt helps to find character or alphabet at that index or location
        // System.out.println(sc.next().trim()); //trim helps to remove unwanted spaces

        char ch=sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
