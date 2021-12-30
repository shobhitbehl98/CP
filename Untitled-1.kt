import java.util.Scanner
fun main(args: Array<String>) {
    val s=Scanner(System.`in`)
    var t=s.nextInt()
    while(t-->0){
        var n=s.nextInt()
        var k=s.nextInt()
        if(n%2==0){
            if(n%4==0){
              println((n/2))+" "+(n/4)+" "+(n/4));
            }else{
            var j=(n-2)/2;
            println("2 "+j+" "+j);
            }
        }else{
            var j=(n-1)/2;
            println("1"+" "+j+" "+j);
        }
    }

}