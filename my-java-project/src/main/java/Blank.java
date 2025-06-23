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
    public static void main(String[] args) {
        System.out.print(findWords("The 2025 Super Rugby Pacific final, stylised as the 2025 Super Rugby Pacific Grand Final was the final match of the 2025 Super Rugby Pacific season and the decider of the Finals Series, the thirtieth season of the Southern Hemisphere's premier rugby union competition organised by SANZAAR. It was the thirtieth Super Rugby final, and the eighth all-New Zealand final. It was played on 21 June 2025 at Apollo Projects Stadium, Christchurch."));
    }
}