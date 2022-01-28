class Solution {
public int removeDuplicates(int[] a) {
int n=a.length;
int ans=0;
int l=0,r=0,c=0,no=0;
while(r<n){
if(a[r]!=no){
c=0;
no=a[r];
}
if(c<2){
a[l++]=a[r];
ans++;
c++;
}
r++;
}
return ans;
}
}