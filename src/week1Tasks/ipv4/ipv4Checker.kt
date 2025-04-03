package week1Tasks.ipv4

fun main() {

}

fun isValidIpV4Address(address: String): Boolean {

    if (address.isBlank()) return false

    val segments = address.split('.')
    val validNumbers = ("0".."255")
    if (segments.size != 4) return false

    for (segment in segments) {
        if (!segment.matches(Regex("\\d+"))) return false
        if (segment !in validNumbers) return false
        if (segment.startsWith("0") && segment != "0") return false
    }
    return true
}