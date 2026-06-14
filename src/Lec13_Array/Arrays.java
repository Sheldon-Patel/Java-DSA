
public class Arrays {
}

    static void main() {

    int arr[]={3,2,-5,21,10};
    int n = arr.length;
    int minValue = arr[0];

    for (int i=0; i<=n-1; i++){
        if(arr[i]< minValue ){
            minValue = arr[i];
        }
        }
        System.out.println(minValue);










//    // max value find out
//    int arr[]={3,2,-5,21,10};
//     int n = arr.length;
//      int maxValue = arr[0];
//
//       // compare mavValue with every element in array
//    for(int i=0; i<=n-1; i++){
//        if(arr[i]>maxValue){
//            //update maxValue
//              maxValue = arr[i];
//        }
//    }
//
//        System.out.println(maxValue);



//        int  arr[]={2,3,10,20};
//        int ans =1;
//        int n=arr.length;
//
//        for (int i =0;i<arr.length;i++){
//            int val=arr[i]; // jo index par hai usko val ma dalo
//            ans = ans*val;
//
//        }
//        System.out.println(ans );


//    int arr[]= {10,20,30,40,50};
//    int sum=0;
//    int n =arr.length;
//
//    for (int i=0;i<=n-1;i++){
//        int value = arr[i];
//        sum = sum+value;
//    }
//    // sum is ready to print when loop finish
//        System.out.println(sum);

//    int arr[]={12,14,1245};
//
//    int n=arr.length;
//
//    for (int index=0;index<=n-1; index++){
//        System.out.println(arr[index]);
//    }





//    int arr[]=new int[5];
//    Scanner sc = new Scanner(System.in);
//    int n=arr.length;
//    // input
//    for(int i=0; i<=n-1; i++){
//        System.out.println("provide input of index "+i);
//        arr[i]=sc.nextInt();
//    }
//
//    // print
//        System.out.println("your array contains: ");
//         for(int val:arr){
//             System.out.println(val);
//         }


//    // declaration
//        int arr[];
//
//        //allocation     1 int take 4 byte so 4 int take 20 byte
//        arr = new int[5];
//
//        // initilization
//        int brr[] = {10,20,30};
//
//        int n=brr.length;
////        for(int index=0; index<=n-1; index++){
////            System.out.println(brr[index]);
////        }
//        for (int val:brr){
//            System.out.println(val);
//        }
//
//        System.out.println("value at 0 index: "+brr[0]);
//        System.out.println("value at 1 index: "+brr[1]);
//        System.out.println("value at 2 index: "+brr[2]);



}