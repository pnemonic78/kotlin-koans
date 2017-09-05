package iii_conventions

operator fun DateRange.contains(date: MyDate): Boolean {
    return (start <= date) && (date <= endInclusive)
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
