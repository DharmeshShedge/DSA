import java.util.*;
class OneDArray {
public static void main(String[] args) {
     
    // first method
    int b[] = {1,2,3,4,5};

        for(int i=0 ; i<5 ; i++){
        System.out.print(b[i] +" ");
    }

    System.out.println();

    // second method
    int a[] = new int[5];

    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;

    for(int i=0 ; i<5 ; i++){
        System.out.print(a[i] +" ");
    }

    System.out.println();

    // user input array
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n= sc.nextInt();
    int arr [] = new int[n];

    System.out.print("Enter array");
    for(int j=0;j<n;j++){
        arr[j]=sc.nextInt();
    }
    System.out.println("Entered array");
    for(int j=0;j<n;j++){
        System.out.print(arr[j]+" ");
    }
    sc.close();
}
}