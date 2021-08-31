package chapter1

import kotlin.math.abs

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

    fun isPalindromePermutation(str: String): Boolean {
        var odds = 0
        val charFrequency: MutableMap<Char, Int> = mutableMapOf()
        val strAsCharArray = str.lowercase().filter { !it.isWhitespace() }.toCharArray()

        strAsCharArray.forEach {
            if (charFrequency.containsKey(it) && charFrequency[it] is Int) {
                charFrequency[it] = charFrequency[it]!!.plus(1)
            } else {
                charFrequency[it] = 1
            }
        }
        charFrequency.forEach { (_, value) ->
            if (value % 2 == 1) {
                odds++
            }
            if (odds > 1) {
                return false
            }
        }
        return true
    }

    fun oneAway(s1: String, s2: String): Boolean {
        val c1 = s1.toCharArray()
        val c2 = s2.toCharArray()

        if (abs(s1.length - s2.length) > 1) {
            return false
        }

        var longerCArr = c2
        var shorterCArr = c1

        if (s1.length > s2.length) {
            longerCArr = c1
            shorterCArr = c2
        }
        val forwardIdx = searchFirstIndex(longerCArr, shorterCArr)
        if (forwardIdx == -1) {
            return false
        }
        val reversedIdx = searchFirstIndex(longerCArr.reversedArray(), shorterCArr.reversedArray())

        return forwardIdx == longerCArr.lastIndex - reversedIdx
    }

    private fun searchFirstIndex(longer: CharArray, shorter: CharArray) : Int {
        longer.forEachIndexed { i, c ->
            try {
                if (c == shorter[i]) {
                    return@forEachIndexed
                } else {
                    return i
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
                return longer.lastIndex
            }
        }
        return -1 // strings are the same
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