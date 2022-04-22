import java.util.Scanner
fun main(args: Array<String>){
    val scn=Scanner(System.`in`)
    var t=scn.nextInt()
    while(t-->0){
        var a=scn.nextInt()
        var b=scn.nextInt()
        var f=a/b
        var x=97
        var ans=""
        while(ans.length<a){
            var m=f
            while(m-->0){
                ans += x.toChar()
            }
            if(x==b+96){
                while(ans.length<a){
                   ans+=x.toChar()
                }
                break
            }
            x++
        }
 
 
        println(ans)
    }
 
}