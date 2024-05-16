package StudyGroup.Study0514;

import java.util.ArrayList;

public class Numbers {

    public String toDivisionEvenOrOdd(int num){
        if (num%2 == 0){
            return "짝수";
        }
        return "홀수";
    }

    public ArrayList<String> toMakeTimesTable(int num){
        ArrayList<String> timesTable = new ArrayList<>();
        timesTable.add(num + "단");
        for (int i = 1; i <= 9; i++) {
            timesTable.add(num + "*" + i + "=" + (num*i));
        }
        return timesTable;
    }
}
