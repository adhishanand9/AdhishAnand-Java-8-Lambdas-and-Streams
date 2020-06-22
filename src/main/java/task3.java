import java.util.*;
import java.util.stream.IntStream;

public class task3 {
    public static void main(String args[])
    {
        List<String> l1=new ArrayList<String>();
        l1.add("aba");
        l1.add("add");
        l1=pal(l1);
        for(String i:l1)
            System.out.println(i);
    }
    static List<String> pal(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
           for(String i:l1)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
            return l2;
    }
}
