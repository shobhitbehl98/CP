import java.util.Scanner;

fun main(args: Array<String>){
val s = Scanner(System. `in`)
val t=s.nextInt();
for(i in 0..t-1){
val d=s.nextInt();
val x=s.nextInt();
val y=s.nextInt();
val z=s.nextInt();
println(Math.max(7*x,(y*d+(7-d)*z)))
}
}