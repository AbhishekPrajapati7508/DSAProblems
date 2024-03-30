var a = -40;
var sum=0;
var prev=0;
var flag=true;
if(a<0){
    a=a*-1;
    flag=false;
}
while(a>0){
    sum= sum+a%10;
    prev=a;
    a=Math.floor(a/10);
}
if(!flag)console.log(sum-(2*prev));
else console.log(sum);
