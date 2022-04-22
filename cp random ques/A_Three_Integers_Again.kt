import java.util.Scanner
fun main() {
    val s=Scanner(System.`in`)
    var t=s.nextInt()
    while(t-->0){
        var x=s.nextInt()
        var y=s.nextInt()
        if(x>y){
            var temp=x;
            x=y;
            y=temp;
        }
        var a=1
        var b=x-a
        var c=y-b
        print(a)
        print(" ")
        print(b)
        print(" ")
        println(c)
    }

}