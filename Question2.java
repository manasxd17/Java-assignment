import java.util.*;

public class Question2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Set");
        int n = sc.nextInt();
        SortedSet<String> main_set = new TreeSet<String>(Find_dups);
        for(int i = 1; i <= n; i++){
            String a = sc.next();
            main_set.add(a);
        }


        System.out.println("After comparing, the unique elements are:");
        for(String i : main_set){
            System.out.println(i);
        }
    }

    static final Comparator<String> Find_dups
            = new Comparator<String>() {
        public int compare(String str1, String str2) {
            return str1.compareToIgnoreCase(str2);
        }
    };
    
}
