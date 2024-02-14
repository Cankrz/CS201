import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception{
        //System.out.println("Hello World");
       File input = new File("C:\\Users\\ck033937\\IdeaProjects\\CS201\\input.txt");
        File output = new File("C:\\Users\\ck033937\\IdeaProjects\\CS201\\output.txt");
        FileWriter writer = new FileWriter(output);
        Scanner in = new Scanner(input);
        while(in.hasNextLine())
        {
            int line=in.nextInt();
            boolean isPrime = true;
            for(int a = 2; a < line; a++){
                if(line % a == 0){
                    isPrime = false;
                }
            }
            if(isPrime == false){
                writer.write(line + " is not prime\n");
            }else{
                writer.write(line + " is prime\n");
            }
        }
        writer.close();
        System.out.println("Writing finished.");
    }
}
