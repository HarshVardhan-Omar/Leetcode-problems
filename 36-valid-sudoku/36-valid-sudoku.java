class Solution {
    private boolean checksubbox(char[][] board,int row,int column){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int i=row;i<row+3;i++){
                    for(int j=column;j<column+3;j++){
                            char key=board[i][j];
                            if(key!='.'){
                                    if(!mp.containsKey(key))
                                            mp.put(key,mp.getOrDefault(key,0)+1);
                                    else
                                            return false;
                            }
                    }
            }
            return true;
    }
    public boolean isValidSudoku(char[][] board) {
            HashMap<Character,Integer> mp=new HashMap<>();
        //Iterate through rows
        for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                        char key=board[i][j];
                        if(key!='.'){
                        if(!mp.containsKey(key))
                                mp.put(key,mp.getOrDefault(key,0)+1);
                        else
                                return false;
                        }
                }
                mp.clear();
                // System.out.println(mp+"hi");
        }
            HashMap<Character,Integer> m=new HashMap<>();
        //Iterating through columns
            for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                            char key=board[j][i];
                            if(key!='.'){
                            if(!m.containsKey(key))
                                    m.put(key,m.getOrDefault(key,0)+1);
                            else
                                    return false;
                            }
                    }
                    m.clear();
            }
            //Checking Subboxes of 3X3 Size
            for(int i=0;i<9;i+=3){
                    boolean result=checksubbox(board,i,0);
                    boolean result1=checksubbox(board,i,3);
                    boolean result2=checksubbox(board,i,6);
                    if(!(result&&result1&&result2)){
                            return false;
                    }
            }
            return true;
    }
}