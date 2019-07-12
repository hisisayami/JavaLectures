package ControlFlow.IF_Block.ForLoop.ForLoop;

public class ForEach_Intro {
    public static void main(String[] args) {

        int nums [] = {4,5,6,7,4,5,6,7};
        int numArray [] = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;

        //normal loop
        for (int i =0; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }

        ////using for each loop and is applicable for array type datas
        for(int i : nums) {
            if(nums[i] % 2 == 1) {
                System.out.println(nums[i]);
            }
        }

        //////////////////////////////
        for(int i : numArray){
            sum += i;

        }
        System.out.println( "Total sum is" + sum);


        /////////////////////////////////


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char c : vowels) {
            System.out.println(c);
        }

            //////////////////////////////////////


            String str = "Hi ";
            int n = 3;
            String result = "";

            for (int i =0; i < n; i++){
                result = result + str;
            }
            System.out.println(result);

    }


}


