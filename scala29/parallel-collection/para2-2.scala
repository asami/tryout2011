import scala.testing.Benchmark

object Para22 extends Benchmark {
  multiplier = 1000
  val data = List.range(1, 10000).toArray.par

  def run() = {
    data.reduce(_ + _)
  }
}
