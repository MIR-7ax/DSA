import java.util.ArrayList;

// import java.util.ArrayList;

public class MedArr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // sc.close
        int nums1[]= {1,2};
        int nums2[]= {3,4};
        int n1 = nums1.length;
        int n2 = nums1.length;
        int n3=n1+n2;
        ArrayList<Integer> h = new ArrayList<>();
        for(int i=0;i<n1;i++){
            h.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            h.add(nums2[i]);
        }
        double median;
        if(n3%2==0){
            int m1 = (n3/2)-1;
            int m2= n3/2;
            double m  = (h.get(m1)+h.get(m2));
            median = m/2.0;
        }
        else{
            int m = n3/2;
            median = h.get(m);
        }
        System.out.println(median);
    }
}
