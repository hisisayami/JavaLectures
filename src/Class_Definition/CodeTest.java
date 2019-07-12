package Class_Definition;

public class CodeTest {

//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"

    public static String FirstHalf(String d){
        if (d.length() % 2 == 1) {
            return  "not valid";
        } else{
            String first= d.substring(0, d.length()/2);
            System.out.println(first);
            return first;
        }



    }
    // Q. print 1st two letter of a given input

    public static String FirstTwo (String e){
        if (e.length() < 2) {
            return e;


        } else{
            String second = e.substring(0,2);
            return second;
        }
    }

//    Q. Return the sum of the numbers in the array, returning 0 for an empty array.
//    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//    sum13([1, 2, 2, 1]) → 6
//    sum13([1, 1]) → 2
//    sum13([1, 2, 2, 1, 13]) → 6

    public static int sum13 (int [] nums){
        int sum =0;
        int i =0;
        while (i <nums.length){
            if(nums[i] == 13){
                i += 2;
            }
            else {
                sum +=nums[i];
                i++;
            }
        }
        System.out.println(sum);
        return sum;

    }

//    Q. Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//
//    sum28([2, 3, 2, 2, 4, 2]) → true
//    sum28([2, 3, 2, 2, 4, 2, 2]) → false
//    sum28([1, 2, 3, 4]) → false

  public static boolean sum28(int nums[]){
        int sum =0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 2){
                sum += nums[i];
            }
        }
        return sum == 8;


  }

    public static void main(String[] args) {
        //FirstTwo("He");
       // System.out.println(FirstTwo("hello"));

        //int n [] ={1,13,1,13};
       // sum13(n);

       // int arr[] = {2,3,3,3,4,2};
        //System.out.println(sum28(arr));


    }


}
