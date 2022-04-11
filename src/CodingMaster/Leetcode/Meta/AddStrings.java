package CodingMaster.Leetcode.Meta;

public class AddStrings {
    public static void main(String[] args) {
        AddStrings addStrings=new AddStrings();
        String output1=addStrings.addStrings("11","123");
        String output2=addStrings.addStrings("456","77");
        String output3=addStrings.addStrings( "99","99");
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }

    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j= num2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0 || j>=0){
            int x1= i >= 0 ? num1.charAt(i)-'0':0;
            int x2= j>=0?num2.charAt(j)-'0':0;
            int value = (x1+x2+carry) %10;
            carry= (x1+x2+carry) /10;
            result.append(value);
            i--;
            j--;
        }
        if(carry!=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
