const prompt=require("prompt-sync")();
let n=parseInt(prompt("input "));
let a=0;
let b=1;
for(let i=0;i<n;i++){
  console.log(a);
  let c=a+b;
  a=b;
  b=c;
}
