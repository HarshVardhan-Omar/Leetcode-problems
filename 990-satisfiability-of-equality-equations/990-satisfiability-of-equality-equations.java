class Solution {
    private int fetchparent(int index,int[] parent){
            if(parent[index] == index)return parent[index];
            return fetchparent(parent[index],parent);
    }
    public boolean equationsPossible(String[] equations) {
            
            int[] parent=new int[26];
            
            for(int i=0;i<26;i++){
                    parent[i] = i;
            }
            
            for(String equation : equations){
                    char ch = equation.charAt(1);
                    
                    if(ch == '='){
                            int parent1=fetchparent(equation.charAt(0)-'a',parent);
                            int parent2=fetchparent(equation.charAt(3)-'a',parent);
                            
                            if(parent1 != parent2){
                                    parent[parent2]=parent1;
                            }
                    }
            }
            
            //Traversing the not equal to equations
            for(String equation : equations){
                    char ch = equation.charAt(1);
                    
                    if(ch == '!'){
                            int parent1=fetchparent(equation.charAt(0)-'a',parent);
                            int parent2=fetchparent(equation.charAt(3)-'a',parent);
                            
                            if(parent1 == parent2)return false;
                    }
            }
            return true;
            
        
    }
}