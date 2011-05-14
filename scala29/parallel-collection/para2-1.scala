import scala.testing.Benchmark

object Para21 extends Benchmark {
  multiplier = 1000
  val data = List.range(1, 10000).par
  println(data.getClass)

  def run() = {
    data.reduce(_ + _)
  }
}
