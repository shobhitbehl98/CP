const prompt=require("prompt-sync")();
let n = parseInt(prompt("input "));
let ans=0;
while(n>0){
    ans++;
    n=Math.floor(n/10);
}
console.log(ans);