const prompt=require("prompt-sync")();
let n=parseInt(prompt("Enter Input "));
let k=parseInt(prompt("Enter rotation "));
let t=n;
let d=0;
while(t>0){
    d++;
    t=Math.floor(t/10);
}
k=k%d;
if(d<0){
    k+=d;
}
let x=Math.pow(10,d-1);
while(k>0){
    let y=n%10;
    n=Math.floor(n/10);
    n+=y*x;
    k--;
}

console.log(n);


