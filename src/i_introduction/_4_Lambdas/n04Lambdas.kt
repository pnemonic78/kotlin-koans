package i_introduction._4_Lambdas

fun task4(collection: Collection<Int>): Boolean = collection.stream().anyMatch { element -> element % 42 == 0 }