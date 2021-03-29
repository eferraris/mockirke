package com.eferraris.mockirke.services

import com.eferraris.mockirke.enums.MethodEnum

interface MockerService {
    fun findResponse(uri: String, method: MethodEnum): Any
}
