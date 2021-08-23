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

    fun checkPermutation(): Boolean {
        return true
    }

    fun urlify() {
        return
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