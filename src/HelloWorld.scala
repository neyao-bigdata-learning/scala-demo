/**
  * Created by yaonengjun on 2017/7/30 下午11:24.
  */
//class HelloWorld {  //定义成class是不能执行main方法的
object HelloWorld {
  def main(args: Array[String]) {
    printf("HelloWorld Scala! 111")
    println("HelloWorld Scala! 222")

    //    showClosure
    //    defaultParameters()
//    iter
    iterWithIf

  }

  def showUsageOfVariables(): Unit = {
    var var1: String = "string"
    var var2: Int = 0
    var var3 = "string"

    var v4 = "0";

  }

  /**
    * 暂时闭包的用法
    */
  def showClosure: Unit = {
    var factor = 3
    var multiplier = (i: Int) => i * factor
    println("multiplier(1): " + multiplier(1))
    println("multiplier(2): " + multiplier(2))
    println("multiplier(3): " + multiplier(3))
  }

  def defaultParameters(a: Int = 5, b: Int = 7): Unit = {
    println("a: " + a)
    println("b: " + b)
    println("a+b: " + (a + b))
  }

  def iter: Unit = {
    for (i <- 1 to 10) {
      println(i)
    }
  }

  def iterWithIf: Unit = {
    for (i <- 1 to 10
         if i != 2; if i != 3
    ) {
      println(i)
    }
  }

}
