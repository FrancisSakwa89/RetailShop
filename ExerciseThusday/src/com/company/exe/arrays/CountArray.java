package com.company.exe.arrays;

public class CountArray {

    int c, i;

//COUNTING EVEN NO'S FROM AN ARRAY//

    public int countEvens(int[] nums) {
        c = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                c++;
            }

        }
        System.out.println(c);

        return c;
    }
    /* FINDING DIFFERENCE BTN MAX AND MIN VALUES */

//    public int bigDiff(int[] nums) {
//        int diff = 0;
//        int minValue = nums[0];
//        int maxValue = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > maxValue) {
//                maxValue = nums[i];
//
//            }
//            if (nums[i] < minValue) {
//                minValue = nums[i];
//            }
//        }
//        diff = maxValue - minValue;
//        System.out.println("max:" + maxValue + " min:" + minValue + " difference: " + diff);
//        return diff;
//
//
//    }

//COUNTING AND STOP AT 13//

        public int count13(int[] nums) {
            int sum=0;
            if(nums.length==0){
                return sum;
            }

            for (i = 0; i<nums.length; i++) {
                if (nums[i]==13){
                    break;

                }
                sum +=nums[i];


            }
            return sum;
        }


        //CENTERED AVERAGE EXERCISE

        public int centeredAverage(int[] numbers) {

            int sum = 0;
            int min= numbers[0];
            int max= numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max= numbers[i];

                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                sum += numbers[i];

            }
            return (sum-(max+min))/(numbers.length-2);






        }

        public int sum67(int[] nums){
            int sum=0;
//            int c=nums[0];

            for (int i=0;i<nums.length; i++){
                if (nums[i]==6){
                    while(nums[i] !=7){
                        i++;
                    }
                }
                else {
                    sum += nums[i];

                }

            }
            System.out.println("The sum is: "+ sum);
            return sum;
        }

        public boolean has22(int [] nums){
            int first=nums[0];
            for (int i=1;i<nums.length;i++){
                if ( first==2 && nums[i]==2){
                   return true;
                }
                else {
                    first=nums[i];
                }
            }
            return false;
    }

    public  boolean lucky13(int[] nums){
            int nos = 0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]==1 || nums[i]==3){
                    return false;
                }


            }
            return true;
    }

    public boolean sum28(int [] nums){
            int sum=0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==2){
                    sum += nums[i];

                }
            }

            if (sum==8){
                return true;
            }
            else {
                return false;
            }
    }

    public boolean more14(int[] nums){
            int count1= 0;
            int count2=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                count1++;

            }

            if (nums[i] == 4) {
                count2++;
            }
        }
            if(count1>count2){
                return true;

        }
            else {
                return false;
            }
        }

    }



