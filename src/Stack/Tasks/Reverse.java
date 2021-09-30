package Stack.Tasks;

import Stack.Stack;

//Класс, переворачивающий значение текста, используя стек
public class Reverse {

    public String reverse(String str){
        int length = str.length();
        Stack<Character> stack = new Stack<Character>(length);
        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
