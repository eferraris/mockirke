package com.eferraris.mockirke.responses

import com.eferraris.mockirke.enums.MethodEnum

data class ResponseMapping (
    val path: String = "",
    val method: MethodEnum? = null,
    val content: Any = ""
)
