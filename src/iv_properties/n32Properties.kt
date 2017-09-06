package iv_properties

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = 0
        set(value) {
            field = value
            counter++
        }
}