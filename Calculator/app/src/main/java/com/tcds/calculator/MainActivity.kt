package com.tcds.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tcds.calculator.operators.OperatorFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// KISS, Just focus on 3
fun calculate(input: ArrayList<String>): Float {
    // if Size = 3, it is a simple: a <op> b
    if (input.size == 3) {
        // Verify a and b are floats
        val a = input[0].toFloatOrNull()
        val b = input[2].toFloatOrNull()
        if (a == null || b == null) throw Error("Syntax Error")

        return OperatorFactory().createOperator(input[1]).calculate(a, b)
    } else {
        throw Error("Overloaded")
    }

    // Filter LHS and RHS of + -
    // Filter LHS and RHS of * /

    /*
        EX) 4 * 2 + 1
        1: op = +, LHS = 4 * 2, RHS = 1
        2: op = *, LHS = 4, RHS = 2
            return 8
        3: 8 + 1 return 9
    */

    /*
    1 + 1
    */

}

//// Trying to use a divide and conquer method here
//fun recurse(input: ArrayList<String>, operator: Int, start: Int, end: Int): Float {
//    if (start.size == 1 && end.size == 1) {
//        return OperatorFactory().createOperator(input[operator]).calculate(input[start].toFloat(), input[end].toFloat())
//    }
//
//    if (start.size > 1) {
//        // Find next operator
//        val operatorPos = findOperator()
//
//        recurse(input, operatorPos, 0, )
//    }
//    if (end.size > 1) {
//        // find next operator
//    }
//}


//fun findOperator(input: ArrayList<String>, start: Int, end: Int): Int {
//    // TODO: need to take order of precedence into account
//
//    var pos = start
//    while (pos < input.size) {
//        if (input[pos].toFloatOrNull() == null) return index
//        pos++
//    }
//    throw Error("Syntax Error")
//}
