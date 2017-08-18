/**
  * Created by yaonengjun on 2017/8/18 下午5:56.
  */
object CaseClassesUsage {

  case class Person(name: String, age: Int)

  def main(args: Array[String]): Unit = {
    val alice = new Person("alice", 23);
    val bob = new Person("bob", 23);
    val chailes = new Person("chailes", 30);

    for (person <- List(alice, bob, chailes)) {
      person match {
        case Person("alice", 23) => println("welcome alice")
        case Person("bob", 23) => println("welcome bob")
        case Person(name1, age1) => println("welcome, name: " + name1 + ", age: " + age1)
      }
    }
  }

}
