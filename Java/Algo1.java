Class binary search
{
Public static void main(String[]args)
int i=1,j=n,x;
x=a[1];
while (i<j){
m=(i+j)/2;
if (x>a[m])
i=m+1;
else {j=m};
}
if (x==a[i]){
System.out.println(i); }
else{
System.out.println(0);
}
}
