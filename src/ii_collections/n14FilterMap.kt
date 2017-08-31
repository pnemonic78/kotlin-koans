package ii_collections

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return customers.map { it.city }.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    return customers.filter { city == it.city }
}


