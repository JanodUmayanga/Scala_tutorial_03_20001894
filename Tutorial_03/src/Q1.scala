

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
    def func(a:Int,b:Int)={
      if(a==1 && b==1){
        println("***")
      }
      else{
        println("###")
        println("===")
      }
    }
    /*a*/func(1,2) 
    /*b*/func(1,3)
    /*c*/func(2,3)
    /*d*/func(2,2)
    
    //Q6
    //a
    def grade(avg:Float):String={
      if(avg<0){
        return "Invalid Marks"
      }
      else if(avg<=39.0){
        return "Fail"
      }
      else if(avg<=54.0){
        return "Pass"
      }
      else if(avg<=69.0){
        return "Good"
      }
      else{
        return "Very Good"
      }
    }
    //b
    def graden(avg:Float):String={
      if(avg>=0){
        if(avg>39){
          if(avg>54){
            if(avg>69){
              return "Very Good"
            }  
            else{
              return "Good"
            }
          }
           else{
             return "Pass"
          }
        }
        else{
          return "Fail"
      }
    }
      else{
        return "Invalid Marks"
      }
    }
    //c
    def gradet(avg:Float):String={
      if (avg<0) return "Invalid marlks" else if(avg<=39) return "Fail" else if(avg<=54) return "Pass" else if(avg<=69) return "Good" else return "Very Good"
    }
    println(grade(75))
    println(graden(61))
    println(gradet(44))
    
    //Q7
    def season(m:Int):String={
      if(m==12 || m==1 || m==2){
        return "Winter"
      }
      else if(m>=3 && m<=5){
        return "Spring"
      }
      else if(m>=6 && m<=8){
        return "Summer"
      }
      else if(m>=9 && m<=11){
        return "Autumn"
      }
      else{
        return "Bogus month"
      }
    }
    println(season(4))
    
    //Q8
    def Fahrenheit(t:Double):Double=t*1.8+32.00
    def Celsius(t:Double):Double=(t-32)*5/9
    println(Fahrenheit(100))
    println(Celsius(212))
    
    //Q9
    
  }
    
}

