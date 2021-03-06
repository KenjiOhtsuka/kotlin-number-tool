# Kotlin Number Tool

Tool to convert number to alphabet expression.

[![CircleCI](https://circleci.com/gh/KenjiOhtsuka/kotlin-number-tool/tree/master.svg?style=svg)](https://circleci.com/gh/KenjiOhtsuka/kotlin-number-tool/tree/master)
[![codecov](https://codecov.io/gh/KenjiOhtsuka/kotlin-number-tool/branch/master/graph/badge.svg)](https://codecov.io/gh/KenjiOhtsuka/kotlin-number-tool)

[![](https://jitpack.io/v/KenjiOhtsuka/kotlin-number-tool.svg)](https://jitpack.io/#KenjiOhtsuka/kotlin-number-tool)

[![Twitter Follow](https://img.shields.io/twitter/follow/escamilloIII.svg?style=social)](https://twitter.com/escamilloIII)

## Usage

```kotlin
NumberUtility.Num2String(1)     # => "one"
NumberUtility.Num2String(100)   # => "one hundred"
NumberUtility.Num2String("2nd") # => "second"
```

## Install

```groovy
repositories {
  maven { url 'https://jitpack.io' }
}
dependencies {
  compile 'com.github.KenjiOhtsuka:kotlin-number-tool:0.1.4'
}
```
