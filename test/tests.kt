import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.FunSpec

class MyTests : FunSpec() {
    init {
        test("first simple test") {
            main.Kodein.Game(false).getGame(2).runGame() shouldEqual false
        }
    }
}