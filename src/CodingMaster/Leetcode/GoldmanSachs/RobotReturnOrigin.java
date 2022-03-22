package CodingMaster.Leetcode.GoldmanSachs;

import java.util.Scanner;

public class RobotReturnOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input moves of Robot: Sample Input moves are URDL" );
        String inputMoves=sc.nextLine();
        RobotReturnOrigin robotReturnOrigin=new RobotReturnOrigin();
        boolean isRobotReturnOrigin=robotReturnOrigin.judgeCircle(inputMoves);
        System.out.println("Does the robot return to origin with input moves given? " +isRobotReturnOrigin);
    }
}
