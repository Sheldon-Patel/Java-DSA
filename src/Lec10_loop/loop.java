package Lec10_loop;

public class loop {
    static void main() {
//        //first loop
//         for (int i=1; i<=5; i++){
//             System.out.println("val of i:"+i) ;
//         }
//
//         for (int a=1; a<=10; a++){
//             System.out.println("love babbar");
//         }
//
//         for(int j=1; j<=20; j+=2){
//             System.out.println(j);
//         }
//
//        for(int j=2; j<=20; j+=2){
//            System.out.println(j);
//        }
//
//        for(int i=1;i<=3;i++){ // row
//            for (int j=1; j<=3; j++){ // coloumns
//                System.out.print("* ");
//            }
//            System.out.println();// move to next line
 //       }
//        for(int i=1;i<=3;i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("i=" + i + ",j=" + j);
//            }
//        }
//        for(int i=1;i<=10;i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for(int i=1;i<=10;i++) {
//            if (i == 5 || i==6 || i==7) {
//                continue; // skip 5   // skip 5,6,7
//            }
//            System.out.println(i);
//        }

        //while
//        //init
//        int i = 1;
//        // condition
//        while(1<=10){
//            //process
//            System.out.println(("love babbarr "));
//
//            // updatation
//            i++;
//        }

        //nested while loop
//        int i=1;
//        while(i<=2){
//            int j =1;
//            while(j<=3){
//                System.out.println("i=" + i + ",j=" + j);
//                j++;
//
//            }
//            i++;
//        }

        // do while
        int i=1;  //init

        do{
            System.out.println(i);
            i++;     //update
        }while (i<=0);     //condition
// the condition is false but it will run at least one time then the condition is checked
    }
}
