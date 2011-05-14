import scala.testing.Benchmark

object Para3 extends Benchmark {
  def run() = {
    List.range(1, 10000).par.reduce( (a, b) => {
      val x = a + b
      val id = Thread.currentThread.getId
      println("%s: %s + %s = %s".format(id, a, b, x))
      x
    })
  }
}
