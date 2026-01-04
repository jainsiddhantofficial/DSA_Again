class Solution{
public double findMedianSortedArrays(int[] a,int[] b){
int[] m=new int[a.length+b.length];
int k=0;
for(int i=0;i<a.length;i++)m[k++]=a[i];
for(int i=0;i<b.length;i++)m[k++]=b[i];
Arrays.sort(m);
int n=m.length;
if(n%2==0)return (m[n/2-1]+m[n/2])/2.0;
return m[n/2];
}
}