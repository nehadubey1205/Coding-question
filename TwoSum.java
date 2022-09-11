/*Given an array of integers, find two numbers such that they add up to a specific target
number.
The function twoSum should return indices of the two numbers such that they add up to
the target, where index1 must be less than index2. Please note that your returned answers
(both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution. */
// Link- https://medium.com/@bhprtk/two-sum-98979af1ab7a
/*O(n
2
) runtime, O(1) space – Brute force:
The brute force approach is simple. Loop through each element x and find if there is
another value that equals to target – x. As finding another value requires looping through
the rest of array, its runtime complexity is O(n
2
).
 */
// Link- https://www.codingninjas.com/codestudio/library/count-number-of-subarrays-with-sum-k
import java.io.*;
class TwoSum{
    public static void main(String[]args){
        int [] a ={1,2,3,4};
        int k =6;
        int res = sumArr(a,k);
        System.out.println(res);
    }
    public static int sumArr(int []a,int k){
        int ans =0;
        int len = a.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len;j++){
                if(a[i]+a[j]==k){
                    ans = ans+1;
                }
            }
        }return ans;
    }
}

