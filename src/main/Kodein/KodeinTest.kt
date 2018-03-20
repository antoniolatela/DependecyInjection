package main.Kodein

import com.github.salomonbrys.kodein.*

interface iGame {
    fun runGame():Boolean
}

class aClass : iGame {
    override fun runGame(): Boolean{
        println("First Game!")
        return true
    }
}

class aClass1 : iGame {
    override fun runGame(): Boolean {
        println("Second Game!")
        return false
    }
}

class Game(val t:Boolean) {

    fun getGame(s: Int): iGame {
        if (t) {}//Todo call for test
        return game.instance(s)
    }

    private val game = Kodein {
        bind<iGame>(1) with provider { aClass() }
        bind<iGame>(2) with provider { aClass1() }
    }
}


class Mastermind {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(Game(false).getGame(1).runGame())
            println(Game(false).getGame(2).runGame())
        }
    }
}

