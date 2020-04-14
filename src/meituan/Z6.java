package meituan;

import java.util.ArrayList;
import java.util.List;

public class Z6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            list.add(new StringBuilder());
        }

        int i = 0;int flag = -1;
        for(char c:s.toCharArray()){
            list.get(i).append(c);
            if(i == 0||i==numRows-1){
                flag = -flag;
            }
            i+=flag;
        }
        list.forEach(sb->res.append(sb));
        return res.toString();
    }
}
