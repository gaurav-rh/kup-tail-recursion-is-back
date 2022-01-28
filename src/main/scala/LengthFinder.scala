import scala.annotation.tailrec

class LengthFinder {
  @tailrec
  final def findLength[A](iterable: Iterable[A], accumulator: Int = 0): Int = {
    if (iterable.isEmpty) accumulator
    else findLength(iterable.tail, accumulator + 1)
  }
}
