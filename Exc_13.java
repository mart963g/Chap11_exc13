package Exc_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exc_13
{
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("Martin","Larsen");
        map.put("Sebastian","Larse2n");
        map.put("Jens","Bo");
        map.put("What","Dafuk");
        System.out.println(map);
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String,String> map)
    {
        HashSet<String> set = new HashSet<>();
        set.addAll(map.values());
        if(set.size()<map.values().size())
        {
            return false;
        }
        return true;
    }

}
