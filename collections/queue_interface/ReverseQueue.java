package collections.queue_interface;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Random random=new Random();
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<n;i++){
            qu.add(10* random.nextInt(60));
        }
    }
}
