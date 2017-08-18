import java.util.Date

/**
  * Created by yaonengjun on 2017/8/18 下午2:58.
  */
object FunctionUsage {
  def main(args: Array[String]): Unit = {

    // 根据名字调用其他函数
    callFunctionByName(currentTime)
    println("-----------")
    println()

    // 将函数作为参数传递
    functionAsParameters(layout, 7)
    println("-----------")
    println()

    //匿名函数
    var inc = (x: Int) => "[" + x.toString + "]"
    println(inc(666))
    println("-----------")
    println()

    //没有参数的匿名函数
    var innerFunctionWithoutParameter = () => {
      System.getProperty("user.dir")
    }
    println(innerFunctionWithoutParameter) //这个调用会打印出<function0>
    println(innerFunctionWithoutParameter()) //这个调用会的到最终结果
    println("-----------")
    println()


    // 偏应用函数：可以定义一个临时函数，这样不用传递所有的参数
    val date = new Date
    //正常是这么调用：
    log(date, "message1")
    log(date, "message2")
    // 但是，可以定义这么个函数
    val logWithDate = log(date, _: String)
    logWithDate("message3")
    logWithDate("message4")
    println("-----------")
    println()


    // 闭包
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
    println("-----------")
    println()
  }

  def currentTime = {
    println("现在时间：")
    System.currentTimeMillis();
  }

  def callFunctionByName(t: => Long) = {
    println("in side delay:")
    println("参数：" + t)
    t
  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def functionAsParameters(f: Int => String, v: Int) = f(v)

  // 此处的[A]表示泛型，写成[A]表示可以是任意类型，写成[A:String]也是可以的。
  //    def layout[A:String](x:A) = "[" + x.toString + "]"
  def layout[A](x: A) = "[" + x.toString + "]"


  def log(date: Date, message: String) = {
    println(date + ": " + message)
  }

  // 闭包
  var factor = 3
  val multiplier = (i:Int) => i * factor

}
