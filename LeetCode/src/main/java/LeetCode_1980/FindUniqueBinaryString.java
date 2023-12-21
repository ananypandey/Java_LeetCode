//package LeetCode_1980;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class FindUniqueBinaryString
//{
//    static HashSet<StringBuilder> hashSet = new HashSet<>();
//    static String notPresentString = new String();
//    static boolean isPresent = false;
//    static boolean checkPresent(StringBuilder stringBuilder, String[] strings)
//    {
//
//    }
//    static void Traverse(int index,StringBuilder ogString, String[] strs)
//    {
//        if(!hashSet.contains(ogString))
//            hashSet.add(ogString);
//        else
//            return;
//        if(checkPresent(ogString,strs))
//        {
//            notPresentString = ogString.toString();
//            isPresent = true;
//        }
////        Traverse(index,);
//    }
//    static void findDifferentBinaryString(String[] str)
//    {
//        StringBuilder stringBuilder = new StringBuilder("0");
//        StringBuilder ogString = new StringBuilder();
//        for (int i=0;i<str[0].length();i++)
//        {
//            ogString.append(stringBuilder);
//        }
//        Traverse(0,ogString,str);
//        System.out.println(ogString);
//    }
//    public static void main(String[] args) {
//        System.out.println("inside Main");
//        String[] strings = {"01","10"};
//        findDifferentBinaryString(strings);
//    }
//}
