package WordSearch;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WordCheck {

    public void pathcheck() {
//         Scanner sc =new Scanner(System.in);
//        System.out.println("enter the path");
//        String path=sc.nextLine();
//        System.out.println("you entered  path is " + path);
//        System.out.println(" plzz enter the word");
//        String word=sc.nextLine();
//        System.out.println("you entered  word is " + word);
//         File fc=new File(path);
//         if (fc.exists()) {
//             System.out.println("processing....");
//         } else{
//             System.out.println("your entered  file is not found......");
//         }
    }

    public static void main(String[] args) {

        WordCheck pc = new WordCheck();
        pc.pathcheck();
        String path = args[0];
        String word = args[1];
        System.out.println("you entered  path is " + path);
        System.out.println("you entered  word is " + word);
        File filecheck = new File(path);
        if (filecheck.exists()) {
            System.out.println("processing....");
        } else {
            System.out.println(" your entered file is  not found......");
        }
//        FileInputStream fis = new FileInputStream("filecheck");
//         int asciicode;
//         while((asciicode = fis.read())!=-1){
//             System.out.print(char(asciicode));
//         }
        }
    }





