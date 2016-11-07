import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.math.max

final class FlippyFlop {
    private val data = ArrayBuffer[Int]()

    def count() : Int = this.data.length

    private def randInt(max: Int = 0) : Int = {
        return Random.nextInt(if (max < 1) 1 else max)
    }

    def flip(element: Int) : Boolean = {
        var success = Random.nextBoolean()
        if (success) {
            var position = randInt(this.count())
            this.data.insert(position, element)
        }
        return success
    }

    def flop() : Option[Int] = {
        if (this.count() > 0) {
            var position = randInt(this.count())
            var ret = this.data(position)
            var shouldRemove = Random.nextBoolean()
            if (shouldRemove) {
                this.data.remove(position)
            }
            return Some(ret)
        }
        else 
            return null
    }
}