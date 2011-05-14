import scala.testing.Benchmark

object Para extends Benchmark {
  multiplier = 1000

  def run() = {
    List.range(1, 10000).par.sum
  }
}
