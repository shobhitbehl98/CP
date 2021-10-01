const prompt=require("prompt-sync")();
let n1 = parseInt(prompt("First Number "));
let n2 = parseInt(prompt("Second Number "));
const arr=[];
for(let i=0;i<=n2;i++){
    arr.push(true);
}

for(let i=2;i*i<=n2;i++){
   if(arr[i]){
       let y=2;
       while(y*i<=n2){
          arr[y*i]=false;
          y++;
       }
   }
}
const abc=[];
for(let i=n1;i<=n2;i++){
   if(arr[i]){
   abc.push(i);
   }
}
console.log(abc);
