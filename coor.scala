import math.{ sqrt, pow }
object coor extends App
{
    val p1= Point(4,7)
    val p2= Point(5,3)
    println("Point p1:"+" "+p1)
    println("Point p2:"+" "+p2)
    
    val addition=p1.add(p2)
    println("\nAddition of 2 given points:"+" "+addition)

    val movep1=p1.move(2,5)
    val movep2=p2.move(2,5)
    println("\nCoordinates of p1 moved to:"+" "+movep1)
    println("Coordinates of p2 moved to:"+" "+movep2)

    val dis=p1.distance(p2)
    println("\nDistance between 2 coordinates:"+" "+dis+" "+"Units")

    val inversionp1=p1.invert(p1)
    val inversionp2=p2.invert(p2)
    println("\nInversion of p1:"+" "+inversionp1)
    println("Inversion of p2:"+" "+inversionp2)

   
}
case class Point(a:Int,b:Int)
{
    def x:Int=a
    def y:Int=b

    def add(r:Point)=new Point(this.x+r.x,this.y+r.y)
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
    def invert(s:Point)=new Point(s.y,s.x)
    def distance(d: Point): Double = 
    {
    sqrt(pow(this.x - d.x,2) + pow(this.y-d.y,2) )
    }
}