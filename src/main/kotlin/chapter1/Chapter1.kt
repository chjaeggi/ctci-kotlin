package chapter1

class Chapter1 {

    fun isUnique(word: String): Boolean {
        val map = mutableMapOf<Char, Boolean>()
        word.forEach {
            if (map.containsKey(it)) {
                return false
            }
            map[it] = true
        }
        return true
    }

    fun isUniqueNoAdditionalDataStructures(word: String): Boolean {
        word.forEachIndexed { index, value ->
            for (i in (index + 1) until word.length) {
                if (word[i] == value) {
                    return false
                }
            }
        }
        return true
    }

    fun isPermutation(s1: String, s2: String): Boolean {
        if (s1 == s2) {
            return false
        }
        if (s1.length != s2.length) {
            return false
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return false
        }
        return s1.toCharArray().sortedArray().contentEquals(s2.toCharArray().sortedArray())
    }

    fun urlify(s: String, len: Int): String {

        val stringToCheck = s.toCharArray()
        var trueEnd = len - 1
        var currentIdx = stringToCheck.size - 1
        val nOfWhitespaces = s.substring(0..trueEnd).count { it == ' ' }
        var replacedWhitespaces = 0

        while (replacedWhitespaces < nOfWhitespaces) {
            if (stringToCheck[trueEnd] != ' ') {
                stringToCheck[currentIdx] = stringToCheck[trueEnd]
                currentIdx -= 1
            } else {
                stringToCheck[currentIdx] = '0'
                stringToCheck[currentIdx - 1] = '2'
                stringToCheck[currentIdx - 2] = '%'
                replacedWhitespaces += 1
                currentIdx -= 3
            }
            trueEnd -= 1
        }

        return String(stringToCheck)
    }

    fun palindromePermutation(): Boolean {
        return true
    }

    fun oneAway(): Boolean {
        return true
    }

    fun stringCompression(): String {
        return ""
    }

    fun rotateMatrix() {
        return
    }

    fun zeroMatrix() {
        return
    }

    fun stringRotation() {
        return
    }
}