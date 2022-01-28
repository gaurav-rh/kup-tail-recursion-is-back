import org.scalatest.flatspec.AnyFlatSpec

class LengthFinderTest extends AnyFlatSpec {
  val intList = List(1, 2, 3, 4, 5, 6, 7)
  val map = Map(1 -> 'b', 2 -> 'c', 3 -> 'd')
  val stringList = List("Gaurav", "prakhar", "reshu")
  val sequence = Seq(1, 2, 3, 4, 5)
  val set = Set(2, 3, 2, 4, 5)

  val lengthFinder = new LengthFinder()

  "a list lengthFinder" should "be valid for Int type" in {
    val result = intList.length
    assert(lengthFinder.findLength(intList) == result)
  }

  "a list lengthFinder" should "be valid for String type" in {
    val result = stringList.length
    assert(lengthFinder.findLength(stringList) == result)
  }

  "a Sequence lengthFinder" should "be valid " in {
    val result = sequence.length
    assert(lengthFinder.findLength(sequence) == result)
  }

  "a set lengthFinder" should "be valid " in {
    val result = set.toList.length
    assert(lengthFinder.findLength(set) == result)
  }

  "a map lengthFinder" should "be valid " in {
    val result = map.toList.length
    assert(lengthFinder.findLength(map) == result)
  }
}
