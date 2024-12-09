```scala
class MyClass(val x: Int) {
  def this() = {
    this(0) 
    println("Auxiliary constructor called") //Explicitly show the constructor was called
  }
}

// Demonstrate using the auxiliary constructor
object Main extends App{
  val myInstance = new MyClass()
  println(myInstance.x) // Output: 0
  val anotherInstance = new MyClass(5)
  println(anotherInstance.x) // Output: 5
}
```