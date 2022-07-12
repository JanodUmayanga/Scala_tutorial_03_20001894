

object Q1 {
  def main(args: Array[String])={
    //Q1
    var a= -100
    var absVal = if(a < 0) -a else a
    println(a,absVal)
    
    //Q2
    //a
    def max(x:Int,y:Int):Int={
      if(x>y){
        return x
      }
      else{
        return y
      }
    }
    println(max(10,69))
    //b
    def maxt(x:Int,y:Int):Int={
       if(x>y) return x else return y
    }
    println(maxt(420,69))
    
    //Q3
    //a
    def max3(x:Int,y:Int,z:Int):Int={
      if(x>y){
        if(x>z){
          return x
        }
        else{
          return z
        }
      }
      else{
        if(y>z){
          return y
        }
        else{
          return z
        }
      }
    }
    println(max3(10,343,54))
    //b
    def max3t(x:Int,y:Int,z:Int):Int={
       if(x>y) if(x>z) return x else return z else if(y>z) return y else return z
    }
    println(max3t(800,343,54))
    
    //Q4
    def oddOrEven(x:Int):String={
      if(x%2==0) return "Even" else return "Odd"
    }
    println(oddOrEven(99))
    
    //Q5
    
  }
    
}

