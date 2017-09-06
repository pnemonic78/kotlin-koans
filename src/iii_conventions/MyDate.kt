package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateRangeIterator(start, endInclusive)
}

operator fun MyDate.compareTo(other: MyDate): Int {
    val y = this.year - other.year
    if (y != 0) {
        return y
    }
    val m = this.month - other.month
    if (m != 0) {
        return m
    }
    return this.dayOfMonth - other.dayOfMonth
}

class DateRangeIterator(start: MyDate, private val endInclusive: MyDate) : Iterator<MyDate> {

    var date: MyDate = start

    override fun hasNext(): Boolean {
        return date <= endInclusive
    }

    override fun next(): MyDate {
        val next = date;
        date = date.nextDay()
        return next
    }
}

operator fun MyDate.plus(other: TimeInterval): MyDate {
    return addTimeIntervals(other, 1)
}