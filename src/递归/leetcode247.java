package 递归;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 中心对称数 II
 *
 * 中心对称数是指一个数字在旋转了 180 度之后看起来依旧相同的数字（或者上下颠倒地看）。
 *
 * 找到所有长度为 n 的中心对称数。
 */
public class leetcode247 {
    public List<String> findStrobogrammatic(int n) {
        List<String> list = null;
        if(n == 1){
            list = new ArrayList<>();
            list.add("0");
            list.add("1");
            list.add("8");
        }
        else{
            list = find(n);
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                if(iterator.next().startsWith("0")){
                    iterator.remove();
                }
            }
        }

        return list;

    }
    public List<String> find(int n){
        List<String> list = new ArrayList<>();
        if(n == 1){
            list.add("0");
            list.add("1");
            list.add("8");
            return list;
        }
        else if(n == 2){
            list.add("00");
            list.add("11");
            list.add("88");
            list.add("69");
            list.add("96");
            return list;

        }
        else{
            List<String> list1 = find(2);
            List<String> list2 = find(n-2);

            for(String s1:list1){
                for(String s2:list2){
                    String str = s1.charAt(0)+s2+s1.charAt(1);
                    list.add(str);
                }
            }
            return list;
        }
    }
}
