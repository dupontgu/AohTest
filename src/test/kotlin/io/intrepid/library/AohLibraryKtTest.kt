package io.intrepid.library

import org.junit.Test

internal class AohLibraryKtTest {

    @Test
    fun testDoThing() {
        val y = doThing(8)
        assert(y == 16)
    }
}