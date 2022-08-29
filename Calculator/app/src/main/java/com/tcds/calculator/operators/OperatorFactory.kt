package com.tcds.calculator.operators

class OperatorFactory {
    // Have extenders also implement their own operator factory with a list of signatures
    private val signatureList: ArrayList<String>  = arrayListOf("+", "*") // This NEEDS to be in your order of precedence

    fun createOperator(op: String): Op {
        // Search through Std operators
        when(op) {
            "+" -> return Add()
            "*" -> return Multiply()
        }

        // TODO: Search through custom plugin operators

        throw Error("Operator Not Found")
    }
}