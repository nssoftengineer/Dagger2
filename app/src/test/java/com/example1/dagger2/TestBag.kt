package com.example1.dagger2

import com.example1.dagger2.qualifier.Bag
import com.example1.dagger2.qualifier.Info

class TestBag: Bag() {
    override fun sayLoveDagger2(): Info {
        return Info("Test Love")
    }
}