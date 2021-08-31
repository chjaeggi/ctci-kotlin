package chapter1

import org.junit.Test
import kotlin.test.assertEquals

class TestCompleteChapter1 {

    private val uniqueTestStrings = listOf("", "a", "abcdef", "1", "äöü", "aAbB")
    private val nonUniqueTestStrings = listOf("aaa", "abcde a", "a b c", "ä,ö,ü")

    @Test
    fun `Assert isUnique`() {
        uniqueTestStrings.forEach {
            assertEquals(true, Chapter1().isUnique(it))
            assertEquals(true, Chapter1().isUniqueNoAdditionalDataStructures(it))
        }
    }

    @Test
    fun `Assert isNotUnique`() {
        nonUniqueTestStrings.forEach {
            assertEquals(false, Chapter1().isUnique(it))
            assertEquals(false, Chapter1().isUniqueNoAdditionalDataStructures(it))
        }
    }

    private val permutations = listOf("abc" to "acb", "aaab" to "baaa")
    private val nonPermutations = listOf("abc" to "ab", "" to "baaa", "" to "")

    @Test
    fun `Assert isPermutation`() {
        permutations.forEach {
            assertEquals(true, Chapter1().isPermutation(it.first, it.second))
        }
    }

    @Test
    fun `Assert isNotPermutation`() {
        nonPermutations.forEach {
            assertEquals(false, Chapter1().isPermutation(it.first, it.second))
        }
    }

    private val urls = listOf(
        Triple("a b c    ", 5, "a%20b%20c"),
        Triple("ab bc bs qwert      ", 14, "ab%20bc%20bs%20qwert"),
        Triple("", 0, "")
    )

    @Test
    fun `Assert urlify returns correct output`() {
        urls.forEach {
            assertEquals(it.third, Chapter1().urlify(it.first, it.second))
        }
    }

    private val palindromes = listOf("Taco cat", "Otto & Anna")
    private val nonPalindromes = listOf("asdfhgergs", "oottttttoi")
    @Test
    fun `Assert palindromes returns correct output`() {
        palindromes.forEach {
            assertEquals(true, Chapter1().isPalindromePermutation(it))
        }
        nonPalindromes.forEach {
            assertEquals(false, Chapter1().isPalindromePermutation(it))
        }
    }
}