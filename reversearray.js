const prompt=require("prompt-sync")();
let arr=[];
let n=parseInt(prompt("input "));
var u="";
for(let i=0;i<n;i++){
    u+=prompt("");
}
arr=u.split("").map(Number);
let abc=[];
for(let i=n-1;i>=0;i--){
    abc.push(arr[i]);
}
console.log(abc);

