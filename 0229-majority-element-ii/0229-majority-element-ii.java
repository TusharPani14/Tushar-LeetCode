class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //At max two elems can be majority elem
        //We will apply the modified voting algo that we have applied in Maj Elem1
        int elem1=Integer.MIN_VALUE;
        int elem2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((elem1==nums[i]||c1==0) && elem2!=nums[i]){
                elem1=nums[i];
                c1++;
            }
            else if((elem2==nums[i]||c2==0) && elem1!=nums[i]){
                elem2=nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elem1){
                c1++;
            }
            if(nums[i]==elem2){
                c2++;
            }
        }
        if(c1>nums.length/3){
            ans.add(elem1);
        }
        if(c2>nums.length/3){
            ans.add(elem2);
        }
        return ans;
    }
}