import scala.testing.Benchmark

object Para2 extends Benchmark {
  multiplier = 1000

  def run() = {
    List.range(1, 10000).par.reduce(_ + _)
  }
}
