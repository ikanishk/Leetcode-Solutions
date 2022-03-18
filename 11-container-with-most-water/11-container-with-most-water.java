class Solution {
    
    //We use a greedy paradigm of thought in which we only check the extreme pairs and not each of the n^2 possible pairs.
    public int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
    int ansar=0;
        
    // We take two pointers at 0 and length of array-1.
    // Now we "only" check the area covered by extreme i and j as all the elements between them will have less width. Hence, lesser area which cannot beat the extreme width and area.
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