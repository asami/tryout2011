import scala.testing.Benchmark

object Sample extends Benchmark {
  multiplier = 1000

  def run() = {
    List.range(1, 10000).sum
  }
}
