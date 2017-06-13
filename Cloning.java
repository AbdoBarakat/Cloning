package cloning;

public class Cloning {
    
    public static void print(int[] a) {
     
        System.out.printf("{%d", a[0]);
        
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }
        
        System.out.println("}");
}

    public static void main(String[] args) {
        
        int [] a = {22, 44, 66, 88 };
        int [] c = a;
        int [] b = (int[])a.clone();
        
        print(a);
        print(b);
        print(c);
        
        a[1] = 33;
        b[1] = 55;
        c[1] = 77;
        
        System.out.println("---------------------------");
        print(a);
        print(b);
        print(c);
    }
}