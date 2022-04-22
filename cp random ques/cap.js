const prompt=require("prompt-sync")();
var str=prompt("Enter string ");
var t=prompt("Enter string ");
function confirmEnding(str, target) {
    let v=target.length;
    var s=str.substring(str.length-v,str.length);
    var r=s==target;
    return r;
  }
  
  var x=confirmEnding(str, t);
  console.log(x);