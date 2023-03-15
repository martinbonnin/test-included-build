package com.example.included

import com.apollographql.apollo3.compiler.OperationIdGenerator
import okio.Buffer

class MyOperationIdGenerator: OperationIdGenerator {

    override val version: String
        get() = "4"

    override fun apply(operationDocument: String, operationName: String): String {
        return operationName
    }
}