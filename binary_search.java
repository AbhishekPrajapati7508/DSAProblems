import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter arrayNumber");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the item to be searched");
        int item=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
                System.out.println("Item found at index "+mid);
                break;
            }
            else if(arr[mid]<item){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(low>high){
            System.out.println(-1);
        }
    }
    
}
