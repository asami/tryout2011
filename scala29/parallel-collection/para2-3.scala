import scala.testing.Benchmark

object Para23 extends Benchmark {
  multiplier = 1000
  val data = Vector(List.range(1, 10000): _*).par

  def run() = {
    data.reduce(_ + _)
  }
}
