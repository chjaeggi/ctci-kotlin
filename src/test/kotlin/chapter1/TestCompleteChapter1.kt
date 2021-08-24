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
}