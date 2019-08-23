package com.example1.dagger2

import com.example1.dagger2.qualifier.Bag
import com.example1.dagger2.qualifier.MagicBox
import dagger.Component

@Component(modules = [Bag::class])
interface TestMagicBox : MagicBox {
    fun poke(app: TestMainActivity)
}