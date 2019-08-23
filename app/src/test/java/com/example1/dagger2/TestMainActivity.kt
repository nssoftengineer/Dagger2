package com.example1.dagger2

import com.example1.dagger2.qualifier.Choose
import com.example1.dagger2.qualifier.HELLO
import com.example1.dagger2.qualifier.Info
import com.example1.dagger2.qualifier.LOVE
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import javax.inject.Inject

class TestMainActivity {

    @Inject
    @field:Choose(LOVE) lateinit var infoLove: Info
    @Inject
    @field:Choose(HELLO) lateinit var infoHello: Info

    @Before
    fun setup() {
        DaggerTestMagicBox.builder().bag(TestBag()).build().poke(this)
    }

    @Test
    fun simpleTest() {
        assertEquals("Test Love", infoLove.text)
        assertEquals("Hello Dagger 2", infoHello.text)
    }
}