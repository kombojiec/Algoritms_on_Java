package Stack;
import Interfaces.Sort;
import LinkedList.FirstLastList;
import QuickSort.QuickSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
