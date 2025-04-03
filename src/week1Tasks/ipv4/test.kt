package week1Tasks.ipv4

fun main() {
    testTheValidityOfAnIPv4Address(
        testName = "when address is empty then return false",
        actualResult = isValidIpV4Address(""),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contain '..' which mean an empty segment between them then return false",
        actualResult = isValidIpV4Address("192..1.105"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains more than 3 '.' and 4 segments then return false",
        actualResult = isValidIpV4Address("192.168.1.1.1"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains less than 3 '.' and 4 segments then return false",
        actualResult = isValidIpV4Address("192.168.1"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address start with dot '.' and have 3 dots '.' then return false",
        actualResult = isValidIpV4Address(".192.168.1"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains numbers above 255 then return false",
        actualResult = isValidIpV4Address("192.168.1.260"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains numbers below 0 then return false",
        actualResult = isValidIpV4Address("192.168.-1.100"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address segments contains any characters or letters other than numbers then return false",
        actualResult = isValidIpV4Address("192.a.*.100"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address segments separated by any character other than '.' then return false",
        actualResult = isValidIpV4Address("192_168.1.100"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains leading zero in any segment then return false",
        actualResult = isValidIpV4Address("01.168.1.150"),
        correctResult = false
    )
    testTheValidityOfAnIPv4Address(
        testName = "when address contains zero in any segment then return true",
        actualResult = isValidIpV4Address("192.168.0.0"),
        correctResult = true
    )
}

fun testTheValidityOfAnIPv4Address(testName: String, actualResult: Boolean, correctResult: Boolean) {
    if (actualResult == correctResult) {
        println("success $testName")
    } else {
        println("Failed $testName")
    }
}