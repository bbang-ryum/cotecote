class Solution {
    fun decodeString(encodedString: String): String {
        return decode(encodedString)
    }

    private fun decode(encodedString: String, decodedString: String = ""): String {
        if (encodedString.isEmpty()) {
            return decodedString
        }

        val firstCharacter = encodedString.first()

        if (firstCharacter.isDigit()) {
            val firstOpenBracket = encodedString.indexOf('[')
            val count = encodedString.substring(0, firstOpenBracket).toInt()
            val matchingCloseBracket = findMatchingCloseBracket(encodedString, firstOpenBracket)
            val innerEncoded = encodedString.substring(firstOpenBracket + 1, matchingCloseBracket)
            val expanded = decode(innerEncoded).repeat(count)
            val remaining = encodedString.substring(matchingCloseBracket + 1)

            return decode(remaining, decodedString + expanded)
        }

        return decode(encodedString.drop(1), decodedString + firstCharacter)
    }

    private fun findMatchingCloseBracket(encodedString: String, openIndex: Int): Int {
        var depth = 0
        var index = openIndex

        while (index < encodedString.length) {
            if (encodedString[index] == '[') {
                depth += 1
            }

            if (encodedString[index] == ']') {
                depth -= 1
            }

            if (depth == 0) {
                return index
            }

            index += 1
        }

        throw RuntimeException()
    }
}
