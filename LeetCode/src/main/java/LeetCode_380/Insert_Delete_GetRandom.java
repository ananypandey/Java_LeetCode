package LeetCode_380;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomizedSet
{
    Set<Integer> set;
    public RandomizedSet()
    {
        set = new HashSet<>();
    }
    public boolean insert(int val)
    {
        if(set.contains(val))
        {
            return false;
        }
        set.add(val);
        return true;
    }
    public boolean remove(int val)
    {
        if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        return false;
    }
    public int getRandom()
    {
        List<Integer> list = new ArrayList<>(set);
        return list.get((int)(Math.random()*set.size()));
    }
}
public class Insert_Delete_GetRandom {
    public static void main(String[] args) {

    }
}
