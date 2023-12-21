package LeetCode797;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget
{
    static List<List<Integer>> lists = new ArrayList<>();
    static void Traverse(int[][] graph,int node,ArrayList<Integer> arrayList)
    {
        if(node == graph.length-1)
        {
            System.out.println(graph.length-1);
            System.out.println("hi");
            lists.add(new ArrayList<>(arrayList));
            return;
        }
        for(int i=0;i<graph[node].length;i++)
        {
            System.out.println(i);
            arrayList.add(graph[node][i]);
            Traverse(graph,graph[node][i],arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
    static void allPathsSourceTarget(int[][] graph)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(0);
            Traverse(graph,0,arrayList);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        allPathsSourceTarget(graph);
        System.out.println(lists);
    }
}
