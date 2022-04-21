package CodingMaster.Leetcode.Meta;

public class BasicCalculator2 {
    public int calculate(String s) {
        if(s.isEmpty() || s==null)return 0;
        int len=s.length();
        int currentNum=0,lastNum=0,result=0;
        char operation='+';
        for(int i=0;i<len;i++){
            char currentChar=s.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNum=(currentNum * 10) + (currentChar - '0');
            }
            if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i==len-1){
                if(operation=='-' || operation=='+'){
                    result+=lastNum;
                    lastNum=(operation=='+') ? currentNum : -currentNum;
                }
                else if (operation == '*'){
                    lastNum=lastNum * currentNum;
                }
                else if (operation == '/'){
                    lastNum=lastNum / currentNum;
                }
                operation=currentChar;
                currentNum=0;
            }
        }
        result+=lastNum;
        return result;
    }
}
