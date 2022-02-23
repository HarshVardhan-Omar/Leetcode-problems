class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        
        if(nums1.length<nums2.length){
            
            return intersect(nums2,nums1);
        } 
          
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n1 = nums1.length ; 
        int n2 = nums2.length ; 
        
        List<Integer> ans = new ArrayList();        
        
        int i=0 ; 
        int j=0 ; 
        
        while(i<n1 && j<n2){
            
            if(n1>n2){
            
            if(nums1[i]==nums2[j]){
                
                
                ans.add(nums1[i]);
                j++;
                i++;
            }
            else if(nums2[j]>nums1[i]){
                
                i++;
    
            }
            else{
                
                j++;
            }
        }
            
        else if(n1==n2){
            
            if(nums1[i]==nums2[j]){
                
                ans.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i]<nums2[j]){
                
                i++;
            }
            
            else{
                
                j++;
            }
        }
            
        else break ;
            
    }
        
    int[] res = new int[ans.size()];
    for(int k=0 ; k<ans.size() ; k++){
        
        res[k] = ans.get(k);
    }
        
    return res ;
 }
}