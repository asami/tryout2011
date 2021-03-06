import scala.testing.Benchmark

object Para8 extends Benchmark {
  val data = List.range(1, 10000).toArray.par
  def run() = {
    data.foreach((a) => {
      val x = a * 10
      val id = Thread.currentThread.getId
      println("%s: %s * 10 = %s".format(id, a, x))
      x
    })
  }
}
