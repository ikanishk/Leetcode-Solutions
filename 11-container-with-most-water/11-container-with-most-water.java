class Solution {
    public int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
    int ansar=0;
    while(i<j){
    if((j-i)*Math.min(height[i],height[j])>ansar){
    ansar=(j-i)*Math.min(height[i],height[j]);
    }
    if(height[i]<height[j]){
     i++;    
    }
    else{
    j--;
    }
   
    }
    return ansar;
    }
}