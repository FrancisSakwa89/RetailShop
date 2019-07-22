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

    public int bigDiff(int[] nums) {
        int diff = 0;
        int minValue = nums[0];
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];

            }
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        diff = maxValue - minValue;
        System.out.println("max:" + maxValue + " min:" + minValue + " difference: " + diff);
        return diff;


    }

//COUNTING AND STOP AT 13//

    public int count13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return sum;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                break;

            }
            sum += nums[i];


        }
        return sum;
    }


    //CENTERED AVERAGE EXERCISE

    public int centeredAverage(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];

        }
        return (sum - (max + min)) / (numbers.length - 2);


    }

    public int sum67(int[] nums) {
        int sum = 0;
//            int c=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (nums[i] != 7) {
                    i++;
                }
            } else {
                sum += nums[i];

            }

        }
        System.out.println("The sum is: " + sum);
        return sum;
    }

    public boolean has22(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (first == 2 && nums[i] == 2) {
                return true;
            } else {
                first = nums[i];
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }


        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];

            }
        }

        if (sum == 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;

            }

            if (nums[i] == 4) {
                count2++;
            }
        }
        if (count1 > count2) {
            return true;

        } else {
            return false;
        }
    }

    public int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = i;

        }
        return fizz;

    }


    public int sum6n7(int[] nums) {
        boolean foundSeven = false;
        boolean foundSix = false;
        int sum = 0;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                foundSix = true;
            }
            if (nums[i] == 7 && foundSix) {
                foundSeven = true;
                continue;
            }
            if (!foundSix || (foundSix && foundSeven)) {
                sum += nums[i];
            }

        }
        return sum;
    }


    public boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                i++;
                return false;
            }


        }
        return true;
    }

    public boolean not14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                i++;
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] str = new String[n];
        String myarr;
        int i;
        for (i = 0; i < n; i++) {
            myarr = Integer.toString(i);
            str[i] = myarr;

        }
        return str;

    }


    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] == val) && (nums[i + 1] == val || nums[i +2]==val))  {
                return true;
            }

        }
        return false;


    }


    public boolean either24(int[] nums) {
        boolean has2 = false;
        boolean has4 = false;
        boolean both = true;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has2= true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has4= true;
            }
            if ((has4==true) && (has2==true)) {
                both = false;
            }
//            else return false;

        }
        return (has2 || has4) && both;
    }
    public int matchUp(int[] nums, int[] nums2) {
        int count = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] > nums2[i]) && (nums[i] - nums2[i] <=2)) {
                count++;
            }
            else if ((nums[i] < nums2[i]) && (nums2[i] - nums[i] <=2)) {
                count++;
            }



            count3 = count;
        }
        return count3;

    }

    public boolean has77(int[] nums) {
        boolean has7 = false;
        boolean sep7 = false;
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i] == 7) && (nums[i+1] == 7)) {
                has7 = true;

            }
            if( i< nums.length-2 && (nums[i]==7 && nums[i + 2] == 7)){
                sep7 = true;
            }
            if (has7==true || sep7==true) {
            }

        }
        return has7 || sep7 ;

    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                continue;

               }
            if (nums[i]==2){
                return true;
            }

        }
        return false;


    }

        public boolean modThree(int[] nums){
            for (int i=0;i<nums.length - 2;i++){
                if ((nums[i] % 2 == nums[i+1]%2) && (nums[i]%2  == nums[i+2]%2)) {
                    return true;
                }

            }
            return false;
        }

        public boolean haveThree(int[] nums){
           int count3 =0;


           for (int i=0; i< nums.length-2 && count3<=3; i++){
               if (nums[i]==3){
                   count3++;
                   continue;
               }
               if (nums[i+2]==3 && count3 ==3){
                   return true;
               }
           }
           return  false;

        }

        public boolean twoTwo(int[] nums){
            for (int i=0;i< nums.length-2;i++){
                if (nums[i]==2 && nums[i+1]==2){
                    return true;
                }
                if (nums[i+1]==2 && nums[i+2] !=2){
                    return false;
                }
            }
        return false;
        }

}





