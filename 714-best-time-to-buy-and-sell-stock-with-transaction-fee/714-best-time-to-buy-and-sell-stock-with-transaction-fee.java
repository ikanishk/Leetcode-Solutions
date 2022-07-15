class Solution {
    public int maxProfit(int[] arr, int fee) {
        int obsp= -arr[0]; //this is the scenario where we have one unsold ticket.
        int ossp= 0;//this is the scenario where we don't have any unsold tickets(bought=sold)
        
        for(int i=1;i<arr.length;i++){
            
        int nbsp=0;
        int nssp=0;
        if(obsp<ossp-arr[i]){
        nbsp=ossp-arr[i];
        }
        
        else{
        nbsp=obsp;
        }
        
        if(ossp<obsp+arr[i]-fee){
        nssp=obsp+arr[i]-fee;
        }
        
        else{
        nssp=ossp;
        }
        
        ossp=nssp;
        obsp=nbsp;
        }   
        return ossp;
    }
}