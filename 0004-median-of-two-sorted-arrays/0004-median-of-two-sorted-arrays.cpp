class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int mid=(nums1.size()+nums2.size())/2;
        int first=0,second=0;
        double ans=0,prev=0;
        for(int i=0;i<=mid;i++){
            prev=ans;
            if(first<nums1.size() && second<nums2.size()){
                if(nums1[first]<nums2[second]){
                    ans=nums1[first];
                    first++;
                }else{
                    ans=nums2[second];
                    second++;
                }
            }
            else if(first<nums1.size()){
                    ans=nums1[first];
                    first++;
                }else{
                    ans=nums2[second];  
                    second++;
                }
        }
        if((nums1.size()+nums2.size())%2==0){
            return (prev+ans)/2;
        }else{
            return ans;
        }
    }
};