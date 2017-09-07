package iv_properties

class LazyProperty(val initializer: () -> Int) {
    val lazy: Int by lazy { initializer() }
}