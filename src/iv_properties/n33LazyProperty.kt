package iv_properties

class LazyProperty(val initializer: () -> Int) {
    private var didLazy: Boolean = false
    val lazy: Int = 0
        get() {
            if (!didLazy) {
                field = initializer()
                didLazy = true
            }
            return field
        }
}