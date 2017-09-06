package iii_conventions

import iii_conventions.TimeInterval.*

class RepeatedTimeInterval(val ti: TimeInterval, val n: Int)

operator fun MyDate.plus(other: RepeatedTimeInterval): MyDate {
    return addTimeIntervals(other.ti, other.n)
}

operator fun TimeInterval.times(other: Int): RepeatedTimeInterval {
    return RepeatedTimeInterval(this, other)
}

fun task29_1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task29_2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

