package v_builders

import java.util.*

fun task37(): Map<Int, String> {
    fun buildMap(build: MutableMap<Int, String>.() -> Unit): Map<Int, String> {
        val map = HashMap<Int, String>()
        map.build()
        return map
    }

    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
