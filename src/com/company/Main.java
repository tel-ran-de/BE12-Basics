package com.company;

public class  Main {

    public static void main(String[] args) {

                         // #2
        System.out.println(diff21(19)); //-> 2
        System.out.println(diff21(10)); //-> 11
        System.out.println(diff21(21)); //-> 0
        System.out.println(diff21(25)); //-> 8

                         // #3
        System.out.println(endUp("hello"));     //-> "heLLO"
        System.out.println(endUp("hi there"));  //-> "hi thERE"
        System.out.println(endUp("hi"));        //-> "HI"

                         // #4
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));

                         // #5
        int[] a= {1,2,3};
        int[] b= {7,3};
        int[] c= {7,3,2};
        int[] d= {1,3};
        System.out.println(commonEnd(a, b));
        System.out.println(commonEnd(a, c));
        System.out.println(commonEnd(a, d));

                        // #6
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));

    }
                         // #2
    public static int diff21 (int n){
        int rez = 0;
        if(n<=21){
            rez=21-n;
        } else {
            rez= (n-21)*2;
        }
        return rez;
    }
                        // #3
    public static String endUp(String str) {
        if (str.length() == 0) return str;
        if (str.length() > 3) {
            return str.substring(0, str.length() - 3).concat(str.substring(str.length() - 3).toUpperCase());
        } else {
            return str.toUpperCase();
        }
    }
                        // #4
    public static int intMax(int a, int b, int c){
        int max=0;
        return max = Math.max(a,Math.max(b,c));
    }
                        // #5
    public static boolean commonEnd(int[] a, int[] b){
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1]){
            return true;
        } else return false;
    }
                        // #6
    public static int countEvens(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
                       // #7 ???????
//    public static int zeroMax (int[] nums){
//        int[] numsResult={nums.length};
//            for(int i=0; i<nums.length; i++){
//            for (int j=0; j<numsResult.length; j++){
//                if(nums[i]==0 && nums[i+1]%2==1){
//                    numsResult[j]= nums[i+1];
//                } else {
//                    nums
//                }
//            }
//        }
//    }
                       // #8
    public static int[] shiftLeft(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
                      // #9
    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }
                      // #10
    public static String middleTwo(String str) {
        if (str.length() % 2 == 1) return str;
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
