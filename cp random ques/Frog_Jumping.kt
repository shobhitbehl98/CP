import java.util.Scanner
fun main(args: Array<String>){
    val s=Scanner(System.`in`)
    var t=s.nextInt();
    while(t-->0){
        var a=s.nextLong();
        var b=s.nextLong();
        var k=s.nextInt();
        var ans:Long=0;
        ans = if(k%2==0){
            (k/2)*(a-b)
        }else{
            ((k-1)/2)*(a-b)+a
        }
 
        println(ans)
    }
 
}