import java.util.*;

class Question1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        List<String> l = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            String a = sc.next();
            l.add(a);
        }
        System.out.println("\n");
        Collections.shuffle(l);
        
        for (String x : l){
            System.out.println(x);
        }
        System.out.println("\n");
        
        //using streams
        l.stream().forEach(i->System.out.println(i));

    }
}