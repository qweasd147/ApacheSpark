object CallByName {

  def main(args: Array[String]): Unit = {
    callByName(eachCall(0));

    val bind5 = bindData(5, _: String)

    bind5("bind 5")

  }

  def eachCall(num: Int): Unit ={

    println(num, "call")
  }

  def callByName(fn: =>Unit): Unit ={
    println("call1")

    fn

    println("call2")

    fn
    fn
  }

  def bindData(bind: Int, any: String): Unit ={
    println(bind, any)
  }
}
