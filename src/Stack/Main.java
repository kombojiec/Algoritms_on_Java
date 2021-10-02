package Stack;
import PriorityQueue.PriorityQueue;
import Queue.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){



    }

    public static String getString() throws IOException {
        String value = "";
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr)){
            value = br.readLine();
        }catch (IOException ex){
            System.out.println(ex);
        }
        return value;
    }
}
