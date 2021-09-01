
import java.util.*;

public class Question3 {

    static void trimList(List<String> str) {
        for (ListIterator<String> main_list = str.listIterator(); main_list.hasNext(); ) {
            main_list.set(main_list.next().trim());
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the List");
        int n = sc.nextInt();
        List<String> l = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            String a = sc.next();
            l.add(a);
        }
        System.out.println("\n");
        trimList(l);
        for (String i : l) {
            System.out.println(i);
        }
    }
}