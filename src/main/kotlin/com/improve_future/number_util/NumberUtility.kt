package com.improve_future.number_util

class NumberUtility {
    companion object {
        enum class NumberType(val type: Int) {
            Normal(0),
            Ordinal(1),
            Annals(2)
        }

        fun convertNum2String(str: String): String {
            return convertNum2String(str.toInt())
        }

        fun convertNum2String(
                num: Int, numberType: NumberType = NumberType.Normal): String {
            return when {
// if num is long, it can be trillion value
//                num >= 1000000000000 -> {
//                    val trillionPlace = num / 1000000000000
//                    val remain = num / 1000000000000
//                    var characters = when (trillionPlace) {
//                        1 -> "one trillion"
//                        else ->
//                                convertLessThan1000ToString(trillionPlace) + " trillion"
//                    }
//                    if (remain > 0)
//                        characters += " and " + convertNum2String(remain, order)
//                    else
//                        if (order) characters += "th"
//                    characters
//                }
                num >= 1000000000 -> {
                    val billionPlace = num / 1000000000
                    val remain = num / 1000000000
                    var characters = when (billionPlace) {
                        1 -> "one billion"
                        else ->
                            convertLessThan1000ToString(billionPlace) + " billion"
                    }
                    if (remain > 0)
                        characters += " and " + convertNum2String(remain, numberType)
                    else
                        if (numberType == NumberType.Ordinal) characters += "th"
                    characters
                }
                num >= 1000000 -> {
                    val millionPlace = num / 1000000
                    val remain = num / 1000000
                    var characters = when (millionPlace) {
                        1 -> "one million"
                        else ->
                            convertLessThan1000ToString(millionPlace) + " million"
                    }
                    if (remain > 0)
                        characters += " and " + convertNum2String(remain, numberType)
                    else
                        if (numberType == NumberType.Ordinal) characters += "th"
                    characters
                }
                num >= 1000 -> {
                    val thousandPlace = num / 1000
                    val remain = num % 1000
                    var characters =  when (thousandPlace) {
                        1 -> "one thousand"
                        else ->
                            convertLessThan1000ToString(thousandPlace) + " thousand"
                    }
                    if (remain > 0)
                        characters += " and " + convertLessThan1000ToString(remain, numberType)
                    else
                        if (numberType == NumberType.Ordinal) characters += "th"
                    characters
                }
                else -> convertLessThan1000ToString(num, numberType, true)
            }
        }

        fun convertLessThan1000ToString(
                num: Int, numberType: NumberType = NumberType.Normal,
                zeroValid: Boolean = false): String {
            val hundredPlace = num / 100
            val remain = num % 100
            return when (hundredPlace) {
                0 -> {
                    convertLessThan100ToString(num, numberType, zeroValid)
                }
                else -> {
                    var characters = convertLessThan20ToString(hundredPlace) + " hundred"
                    if (remain > 0)
                        characters +=
                                " and " + convertLessThan100ToString(remain, numberType, false)
                    else
                        if (numberType == NumberType.Ordinal) characters += "th"
                    characters
                }
            }
        }

        fun convertLessThan100ToString(
                num: Int, numberType: NumberType = NumberType.Normal,
                zeroValid: Boolean = false): String {
            val remain = num % 10
            return when {
                num >= 20 -> {
                    var characters = convert10LevelToString(
                            num / 10, if (remain > 0) NumberType.Normal else numberType)
                    if (remain > 0)
                        characters += " " + convertLessThan20ToString(num % 10, numberType)
                    characters
                }
                else -> {
                    convertLessThan20ToString(num, numberType, zeroValid)
                }
            }
        }

        fun convertLessThan20ToString(
                num: Int, numberType: NumberType = NumberType.Normal,
                zeroValid: Boolean = false): String {
            return when (num) {
                1 -> when (numberType) {
                    NumberType.Ordinal -> "first"
                    else -> "one"
                }
                2 -> when (numberType) {
                    NumberType.Ordinal -> "second"
                    else -> "two"
                }
                3 -> when (numberType) {
                    NumberType.Ordinal -> "third"
                    else -> "three"
                }
                4 -> when (numberType) {
                    NumberType.Ordinal -> "forth"
                    else -> "four"
                }
                5 -> when (numberType) {
                    NumberType.Ordinal -> "fifth"
                    else -> "five"
                }
                6 -> when (numberType) {
                    NumberType.Ordinal -> "sixth"
                    else -> "six"
                }
                7 -> when (numberType) {
                    NumberType.Ordinal -> "seventh"
                    else -> "seven"
                }
                8 -> when (numberType) {
                    NumberType.Ordinal -> "eighth"
                    else -> "eight"
                }
                9 -> when (numberType) {
                    NumberType.Ordinal -> "ninth"
                    else -> "nine"
                }
                10 -> when (numberType) {
                    NumberType.Ordinal -> "tenth"
                    else -> "ten"
                }
                11 -> when (numberType) {
                    NumberType.Ordinal -> "eleventh"
                    else -> "eleven"
                }
                12 -> when (numberType) {
                    NumberType.Ordinal -> "twelfth"
                    else -> "twelve"
                }
                13 -> when (numberType) {
                    NumberType.Ordinal -> "thirteenth"
                    else -> "thirteen"
                }
                14 -> when (numberType) {
                    NumberType.Ordinal -> "fourteenth"
                    else -> "fourteen"
                }
                15 -> when (numberType) {
                    NumberType.Ordinal -> "fifteenth"
                    else -> "fifteen"
                }
                16 -> when (numberType) {
                    NumberType.Ordinal -> "sixteenth"
                    else -> "sixteen"
                }
                17 -> when (numberType) {
                    NumberType.Ordinal -> "seventeenth"
                    else -> "seventeen"
                }
                18 -> when (numberType) {
                    NumberType.Ordinal -> "eighteenth"
                    else -> "eighteen"
                }
                19 -> when (numberType) {
                    NumberType.Ordinal -> "nineteenth"
                    else -> "nineteen"
                }
                else ->
                    if (zeroValid && num == 0)  "zero"
                    // normally unreached
                    else throw Exception("Argument is out of range.")
            }
        }

        fun convert10LevelToString(
                num: Int, numberType: NumberType = NumberType.Normal): String {
            return when (num) {
                2 -> when (numberType) {
                    NumberType.Ordinal -> "twentieth"
                    NumberType.Annals -> "twenties"
                    else -> "twenty"
                }
                3 -> when (numberType) {
                    NumberType.Ordinal -> "thirtieth"
                    NumberType.Annals -> "thirties"
                    else -> "thirty"
                }
                4 -> when (numberType) {
                    NumberType.Ordinal -> "fortieth"
                    NumberType.Annals -> "forties"
                    else -> "forty"
                }
                5 -> when (numberType) {
                    NumberType.Ordinal -> "fiftieth"
                    NumberType.Annals -> "fifties"
                    else -> "fifty"
                }
                6 -> when (numberType) {
                    NumberType.Ordinal -> "sixtieth"
                    NumberType.Annals -> "sixties"
                    else -> "sixty"
                }
                7 -> when (numberType) {
                    NumberType.Ordinal -> "seventieth"
                    NumberType.Annals -> "seventies"
                    else -> "seventy"
                }
                8 -> when (numberType) {
                    NumberType.Ordinal -> "eightieth"
                    NumberType.Annals -> "eighties"
                    else -> "eighty"
                }
                9 -> when (numberType) {
                    NumberType.Ordinal -> "ninetieth"
                    NumberType.Annals -> "nineties"
                    else -> "ninety"
                }
                else -> throw Exception("Argument is out of range.") // normally unreached
            }
        }
    }
}