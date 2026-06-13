
public class Arrays {
}

    static void main() {
    // declaration
        int arr[];

        //allocation     1 int take 4 byte so 4 int take 20 byte
        arr = new int[5];

        // initilization
        int brr[] = {10,20,30};

        int n=brr.length;
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }
        for (int val:brr){
            System.out.println(val);
        }

        System.out.println("value at 0 index: "+brr[0]);
        System.out.println("value at 1 index: "+brr[1]);
        System.out.println("value at 2 index: "+brr[2]);



}