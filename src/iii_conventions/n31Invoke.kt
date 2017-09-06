package iii_conventions

class Invokable {

    private var count: Int = 0

    operator fun invoke(): Invokable {
        count++
        return this
    }

    fun getNumberOfInvocations(): Int {
        return count
    }
}

fun task31(invokable: Invokable): Int {
    return invokable()()()().getNumberOfInvocations()
}
