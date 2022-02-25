class Solution {
    private String removeleadingzero(String s){
            int i=0;
            while(s.charAt(i)=='0'&&s.length()>1){
                  i++;
                  if(i==s.length()){
                          break;
                  }
            }
            s=s.substring(i);
            return s;
            
    }
    private int compare(String s1,String s2){
            int n1=s1.length();
            int n2=s2.length();
            int a=0;
            int b=0;
            int temp=n1;
            int temp1=n2;
            for(int i=0;i<n1;i++){
                    a=(int)((s1.charAt(i)-'0')*Math.pow(10,temp-1))+a;
                    temp--;
                    
            }
            for(int j=0;j<n2;j++){
                    b=(int)((s2.charAt(j)-'0')*Math.pow(10,temp1-1))+b;
                    temp1--;
            }
            if(a>b){
                    return 1;
            }
            else if(a<b){
                    return -1;
            }
            return 0;
    }
    public int compareVersion(String s1, String s2) {
            int n=s1.length();
            int m=s2.length();
            s1=s1+'.';
            s2=s2+'.';
            int ans=0;
            while(n>0&&m>0){
                    int dot1=s1.indexOf('.');
                    int dot2=s2.indexOf('.');
                    String str1=removeleadingzero(s1.substring(0,dot1));
                    String str2=removeleadingzero(s2.substring(0,dot2));
                    s1=s1.substring(dot1+1);
                    s2=s2.substring(dot2+1);
                    ans=compare(str1,str2);
                    if(ans!=0){
                            return ans;
                    }
                    n=s1.length();
                    m=s2.length();
            }
            while(n!=0){
                    int dot1=s1.indexOf('.');
                    String s=s1.substring(0,dot1);
                    ans=compare(s,"0");
                    if(ans!=0){
                            return ans;
                    }
                    s1=s1.substring(dot1+1);
                    n=s1.length();
            }
            while(m!=0){
                    int dot1=s2.indexOf('.');
                    String s=s2.substring(0,dot1);
                    ans=compare("0",s);
                    if(ans!=0){
                            return ans;
                    }
                    s2=s2.substring(dot1+1);
                    m=s2.length();
                    
            }
            return ans;
            
            
    }
}