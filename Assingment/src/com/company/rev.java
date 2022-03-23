package com.company;
import java.util.*;
public class rev {
    public static void Main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int a,i;
        a= sc.nextInt();
        for (i=0;i<a;i++)
            al.add (sc.next());
        for (i=al.size()-1; i == 0; i--)
        {
            System.out.println(al.get(i));
        }
    }
}
