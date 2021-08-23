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

}