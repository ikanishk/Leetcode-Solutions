class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        for(int i=0; i<n; i++)
        {
            int ele = nums[i];
            if(ele==num1)
				count1++;
            else if(ele==num2)
				count2++;
            else if(count1==0)
            {
                num1 = ele;
                count1 = 1;
            }
            else if(count2==0)
            {
                num2 = ele;
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==num1)
				count1++;
            else if(nums[i]==num2)
				count2++;
        }
        
        if(count1>n/3)
			ans.add(num1);
        if(count2>n/3)
			ans.add(num2);
        
        return ans;
    }
}