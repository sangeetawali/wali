package Example1

import scala.collection.mutable.StringBuilder

object StringReverse {
  
  def main(args :Array[String]){
  }
  def reverse1(s:String):String={
    s.reverse
  }
  
  def reverse2(s:String):String={
    val build=new StringBuilder
    val slen=s.length
    for(i<-0 until s.length){
      build.append(s.charAt(slen-i-1))
    }
    build.toString
  }
 

}