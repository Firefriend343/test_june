import java.util.ArrayList;

public class Blank {
    public static ArrayList<String> findWords(String input) {
        ArrayList<String> output = new ArrayList<String>();
        //int start = 0;
        //int end = 0;
        StringBuilder temp = new StringBuilder();
        char y = ' ';
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (i !=0) {
                y = input.charAt(i-1);
            }
            if (i == (input.length() - 1) && (Character.isDigit(x) || Character.isLetter(x) || x == '\'')) {
                temp.append(x);
                output.add(temp.toString());
                temp.setLength(0);
            } 
            else if (Character.isDigit(x) || Character.isLetter(x) || x == '\'') {                
                temp.append(x);
            }
            else if (!(Character.isDigit(x) || Character.isLetter(x) || x == '\'') && (Character.isDigit(y) || Character.isLetter(y) || y == '\'')) {
                output.add(temp.toString());
                temp.setLength(0);
            }
         }
        
        return output;
    }
    public static boolean isCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        if (!(Character.isLetter(s.charAt(0)) && Character.isLowerCase(s.charAt(0)))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetter(s.charAt(0)) || Character.isDigit(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(isCamelCase("hHello"));
    }
}