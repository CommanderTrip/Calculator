package com.tcds.calculator.operators

class Multiply : Op {
    override fun calculate(a: Float, b: Float): Float {
        return a * b
    }
}