object ValueType {

  def main(args: Array[String]): Unit = {

    //일반적인 변수
    var x = 10
    x = 15

    //const 타입 변수
    val y = 30;
    //y = 50;   error!

    //타입 명시(explicit type)
    var z: String = "String!"

    //z = 515214521;  error!

    println(x,y,z)

    //함수 정의
    def fn1(x: Int)={x*x};
    //def fn1(x: Int): Int ={return x*x};

    def fn2(x: Any)={println(x)};

    fn2(fn1(5))
    fn2(fn1(10))
  }

}
