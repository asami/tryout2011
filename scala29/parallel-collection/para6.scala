import scala.testing.Benchmark

object Para6 extends Benchmark {
  val data = List.range(1, 10000).toArray.par
  def run() = {
    data.map( (a) => {
      val x = a * 10
      val id = Thread.currentThread.getId
      println("%s: %s * 10 = %s".format(id, a, x))
      x
    }).reduce( (a, b) => {
      val x = a + b
      val id = Thread.currentThread.getId
      println("%s: %s + %s = %s".format(id, a, b, x))
      x
    })
  }
}
