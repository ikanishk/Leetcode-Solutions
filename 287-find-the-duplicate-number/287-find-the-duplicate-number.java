class Solution
{


    public int findDuplicate(int[] nums)
	{
		int ans = msbToggleSolution(nums);
    return ans;
  }
	
	public int msbToggleSolution(int[] array)
	{
		for(int i = 0; i < array.length; ++i)
		{
			int val = array[i];
			int idx = val - 1;
			if(val < 0)
				idx = (int)Math.abs(val) - 1;
			if(array[idx] > 0)
				array[idx] *= -1;
			else
				return (int)Math.abs(val);
		}
		return -1;
	}
	
	
}