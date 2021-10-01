package Stack.Tasks;

import Stack.Stack;

public class Brackets {
    public static void check(String str){
        int size = str.length();
        Stack<Character> stack= new Stack<Character>(size);
        char ch;

        for (int i = 0; i < size; i++) {
            ch = str.charAt(i);
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;

                case ')':
                case '}':
                case ']':
                    if(!stack.isEmpty()){
                        char tmp = stack.pop();
                        if(ch == ')' && tmp != '(' ||
                            ch == '}' && tmp != '{' ||
                            ch == ']' && tmp != '['){
                            System.out.printf("Some error with bracket %s at position %d", ch, + i);
                            return;
                        }
                    } else {
                        System.out.printf("Some error with bracket %s at position %d", ch, i);
                        return;
                    }
                    break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Some error: missing right bracket");
        } else {
            System.out.println("String is correct.");
        }
    }
}
