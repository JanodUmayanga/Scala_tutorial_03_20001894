

object Q9 extends App {
  
  def addition(x:Float,y:Float):Float={
    return x+y;
  }
  def substraction(x:Float,y:Float):Float={
    return x-y;
  }
  def multiplication(x:Float,y:Float):Float={
    return x*y;
  }
  def division(x:Float,y:Float):Float={
    return x/y;
  }
  
  println("Pocket Calculator")
  println("=================")
  println("Operation?")
  val oprtr = scala.io.StdIn.readChar()
  println("Operand 1?")
  val oprnd1 = scala.io.StdIn.readFloat()
  println("Operand 2?")
  val oprnd2 = scala.io.StdIn.readFloat()
  if(oprtr=='+'){
    println("Answer : " + addition(oprnd1,oprnd2))
  }
  else if(oprtr=='-'){
    println("Answer : " + substraction(oprnd1,oprnd2))
  }
  else if(oprtr=='*'){
    println("Answer : " + multiplication(oprnd1,oprnd2))
  }
  else if(oprtr=='/'){
    println("Answer : " + division(oprnd1,oprnd2))
  }
  else{
    println("Invalid operator")
  }
}