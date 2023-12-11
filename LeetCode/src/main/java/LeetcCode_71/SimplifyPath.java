package LeetcCode_71;

import java.util.Stack;

public class SimplifyPath
{
    static String simplyPaths(String path) {
        String[] strings = path.split("/");
        StringBuilder nstr = new StringBuilder();
        for(String str : strings)
        {
            if(str.isEmpty() || str.equals("."))
                continue;
            else if(str.equals("..")) {
                if (nstr.length() > 0) {
                    int lastIndex = nstr.lastIndexOf("/");
                    nstr.delete(lastIndex, nstr.length());
                }
            }
            else
            {
                nstr.append("/").append(str);
            }
        }
        if(nstr.length()==0)
            nstr.append("/");
        return nstr.toString();
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        System.out.println(simplyPaths("/home/djkdk/nfif/../"));
    }
}
