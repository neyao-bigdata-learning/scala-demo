/**
  * Created by yaonengjun on 2017/8/18 下午5:50.
  */
object CaseMatchUsage {

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest(2))
    println(matchTest("two"))
    println(matchTest(333))
  }

  def matchTest(x: Any):Any = x match {
    case 1 => "one"
    case 2 => 2
    case "two" => 2
    case _ => "others"
  }

}
