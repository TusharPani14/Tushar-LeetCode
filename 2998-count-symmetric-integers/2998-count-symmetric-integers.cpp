class Solution {
public:
    int countSymmetricIntegers(int low, int high) {
        int ans=0;
        while(low<=high){
            int temp=low,d=0,sumL=0,sumR=0,count=1;
            int digits=floor(log10(temp) + 1); 
            if(digits%2!=0){
                low++;
                continue;
            }
            while(temp>0){
                d=temp%10;
                if(count<=(digits/2)){
                    sumL+=d;
                    count++;
                }else{
                    sumR+=d;
                    count++;
                }
                temp=temp/10;
            }
            if(sumL==sumR){
                ans++;
            }
            low++;
        }
        return ans;
    }
};