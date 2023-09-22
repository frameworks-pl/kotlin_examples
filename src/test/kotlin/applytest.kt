package pl.frameworks.kt_examples.tests;

import org.junit.Test;
import kotlin.test.assertEquals

//Data class purpose is to hold data and additionally it comes with ready to use methods to print objects in readable way
data class SomeClass(var name: String = "", var value : Int = 0)


class ApplyTest {

    @Test
    fun testApply() {

        //apply method is used to execute a block of code on an object.
        //It is often used when you want to perform a series of operations on an object and modify
        //its properties or state
        val someObject = SomeClass().apply {
            name = "John"
            value = 30
        }

        assertEquals(30, someObject.value)
        assertEquals("John", someObject.name)
    }
}