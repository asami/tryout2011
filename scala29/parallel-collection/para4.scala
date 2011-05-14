import scala.testing.Benchmark

object Para4 extends Benchmark {
  def run() = {
    List.range(1, 10000).toArray.par.reduce( (a, b) => {
      val x = a + b
      val id = Thread.currentThread.getId
      println("%s: %s + %s = %s".format(id, a, b, x))
      x
    })
  }
}
