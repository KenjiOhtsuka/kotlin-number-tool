package com.improve_future.number_util

import org.junit.Test
import kotlin.test.assertEquals

class NumberUtilityTest {
    @Test
    fun shouldConvertNum2String() {
        assertEquals("zero", NumberUtility.convertNum2String(0))
        assertEquals("one", NumberUtility.convertNum2String(1))
        assertEquals("two", NumberUtility.convertNum2String(2))
        assertEquals("three", NumberUtility.convertNum2String(3))
        assertEquals("four", NumberUtility.convertNum2String(4))
        assertEquals("five", NumberUtility.convertNum2String(5))
        assertEquals("six", NumberUtility.convertNum2String(6))
        assertEquals("seven", NumberUtility.convertNum2String(7))
        assertEquals("eight", NumberUtility.convertNum2String(8))
        assertEquals("nine", NumberUtility.convertNum2String(9))
        assertEquals("ten", NumberUtility.convertNum2String(10))
        assertEquals("eleven", NumberUtility.convertNum2String(11))
        assertEquals("twelve", NumberUtility.convertNum2String(12))
        assertEquals("thirteen", NumberUtility.convertNum2String(13))
        assertEquals("fourteen", NumberUtility.convertNum2String(14))
        assertEquals("fifteen", NumberUtility.convertNum2String(15))
        assertEquals("sixteen", NumberUtility.convertNum2String(16))
        assertEquals("seventeen", NumberUtility.convertNum2String(17))
        assertEquals("eighteen", NumberUtility.convertNum2String(18))
        assertEquals("nineteen", NumberUtility.convertNum2String(19))
        assertEquals("twenty", NumberUtility.convertNum2String(20))
        assertEquals("twenty one", NumberUtility.convertNum2String(21))
        assertEquals("thirty", NumberUtility.convertNum2String(30))
        assertEquals("forty", NumberUtility.convertNum2String(40))
        assertEquals("fifty", NumberUtility.convertNum2String(50))
        assertEquals("sixty", NumberUtility.convertNum2String(60))
        assertEquals("seventy", NumberUtility.convertNum2String(70))
        assertEquals("eighty", NumberUtility.convertNum2String(80))
        assertEquals("ninety", NumberUtility.convertNum2String(90))
        assertEquals(
                "one thousand",
                NumberUtility.convertNum2String(1000))
        assertEquals(
                "one thousand and ten",
                NumberUtility.convertNum2String(1010))
        assertEquals(
                "two thousand",
                NumberUtility.convertNum2String(2000))
        assertEquals(
                "one hundred and forty two thousand and sixty eight",
                NumberUtility.convertNum2String(142068))

        //assertEquals(NumberUtility.convertNum2String(0), "zero")
        assertEquals("first", NumberUtility.convertNum2String(
                1, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("second", NumberUtility.convertNum2String(
                2, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("third", NumberUtility.convertNum2String(
                3, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("forth", NumberUtility.convertNum2String(
                4, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("fifth", NumberUtility.convertNum2String(
                5, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("sixth", NumberUtility.convertNum2String(
                6, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("seventh", NumberUtility.convertNum2String(
                7, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("eighth", NumberUtility.convertNum2String(
                8, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("ninth", NumberUtility.convertNum2String(
                9, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("tenth", NumberUtility.convertNum2String(
                10, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("eleventh", NumberUtility.convertNum2String(
                11, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("twelfth", NumberUtility.convertNum2String(
                12, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("thirteenth", NumberUtility.convertNum2String(
                13, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("fourteenth", NumberUtility.convertNum2String(
                14, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("fifteenth", NumberUtility.convertNum2String(
                15, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("sixteenth", NumberUtility.convertNum2String(
                16, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("seventeenth", NumberUtility.convertNum2String(
                17, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("eighteenth", NumberUtility.convertNum2String(
                18, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("nineteenth", NumberUtility.convertNum2String(
                19, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("twentieth", NumberUtility.convertNum2String(
                20, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("twenty first", NumberUtility.convertNum2String(
                21, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("thirtieth", NumberUtility.convertNum2String(
                30, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("fortieth", NumberUtility.convertNum2String(
                40, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("fiftieth", NumberUtility.convertNum2String(
                50, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("sixtieth", NumberUtility.convertNum2String(
                60, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("seventieth", NumberUtility.convertNum2String(
                70, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("eightieth", NumberUtility.convertNum2String(
                80, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("ninetieth", NumberUtility.convertNum2String(
                90, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "one thousandth",
                NumberUtility.convertNum2String(
                        1000, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "one thousand and tenth",
                NumberUtility.convertNum2String(
                        1010, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "two thousandth",
                NumberUtility.convertNum2String(
                        2000, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "one hundred and forty two thousand and sixty eighth",
                NumberUtility.convertNum2String(
                        142068, NumberUtility.Companion.NumberType.Ordinal))

        // ToDo:
//        assertEquals(
//                "nineteen eighties",
//                NumberUtility.convertNum2String(
//                        1980, NumberUtility.Companion.NumberType.Annals))
        assertEquals(
                "nineties",
                NumberUtility.convertNum2String(
                        90, NumberUtility.Companion.NumberType.Annals))
    }

    @Test
    fun shouldConvertLessThan20ToString() {
        assertEquals("zero", NumberUtility.convertLessThan20ToString(
                0, NumberUtility.Companion.NumberType.Normal, true))
        assertEquals("five", NumberUtility.convertLessThan20ToString(5))
        assertEquals("eleven", NumberUtility.convertLessThan20ToString(11))

        assertEquals("second", NumberUtility.convertLessThan20ToString(
                2, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("seventeenth", NumberUtility.convertLessThan20ToString(
                17, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals("eighteenth", NumberUtility.convertLessThan20ToString(
                18, NumberUtility.Companion.NumberType.Ordinal))
    }

    @Test
    fun shouldConvertLessThan100ToString() {
        assertEquals("zero", NumberUtility.convertLessThan100ToString(
                0, NumberUtility.Companion.NumberType.Normal, true))
        assertEquals("five", NumberUtility.convertLessThan100ToString(5))
        assertEquals("eleven", NumberUtility.convertLessThan100ToString(11))
        assertEquals("twenty four", NumberUtility.convertLessThan100ToString(24))
        assertEquals("forty", NumberUtility.convertLessThan100ToString(40))
        assertEquals("sixty eight", NumberUtility.convertLessThan100ToString(68))
        assertEquals("ninety four", NumberUtility.convertLessThan100ToString(94))

        assertEquals(
                "first",
                NumberUtility.convertLessThan100ToString(
                        1, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "thirtieth",
                NumberUtility.convertLessThan100ToString(
                        30, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "forty ninth",
                NumberUtility.convertLessThan100ToString(
                        49, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "fortieth",
                NumberUtility.convertLessThan100ToString(
                        40, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "seventy first",
                NumberUtility.convertLessThan100ToString(
                        71, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "eighty second",
                NumberUtility.convertLessThan100ToString(
                        82, NumberUtility.Companion.NumberType.Ordinal))
    }

    @Test
    fun shouldConvertLessThan1000ToString() {
        assertEquals(
                "one hundred",
                NumberUtility.convertLessThan1000ToString(100))
        assertEquals(
                "one hundred and one",
                NumberUtility.convertLessThan1000ToString(101))
        assertEquals(
                "two hundred and fifty five",
                NumberUtility.convertLessThan1000ToString(255))
        assertEquals(
                "seven hundred and eighty",
                NumberUtility.convertLessThan1000ToString(780))
        assertEquals(
                "eight hundred and forty two",
                NumberUtility.convertLessThan1000ToString(842))
        assertEquals(
                "nine hundred and ten",
                NumberUtility.convertLessThan1000ToString(910))
        assertEquals(
                "ninety six",
                NumberUtility.convertLessThan1000ToString(96))

        assertEquals(
                "one hundredth",
                NumberUtility.convertLessThan1000ToString(
                        100, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "one hundred and first",
                NumberUtility.convertLessThan1000ToString(
                        101, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "two hundred and fifty fifth",
                NumberUtility.convertLessThan1000ToString(
                        255, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "seven hundred and eightieth",
                NumberUtility.convertLessThan1000ToString(
                        780, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "eight hundred and forty second",
                NumberUtility.convertLessThan1000ToString(
                        842, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "nine hundred and tenth",
                NumberUtility.convertLessThan1000ToString(
                        910, NumberUtility.Companion.NumberType.Ordinal))
        assertEquals(
                "ninety sixth",
                NumberUtility.convertLessThan1000ToString(
                        96, NumberUtility.Companion.NumberType.Ordinal))
    }
}