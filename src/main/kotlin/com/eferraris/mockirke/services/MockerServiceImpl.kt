package com.eferraris.mockirke.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.eferraris.mockirke.enums.MethodEnum
import com.eferraris.mockirke.exceptions.NotFoundException
import com.eferraris.mockirke.responses.ResponseMapping
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.io.File

@Service
class MockerServiceImpl: MockerService {

    @Value("\${mockerke.mapping.path}")
    val mappingPath: String = ""

    override fun findResponse(uri: String, method: MethodEnum): Any = ObjectMapper()
        .readValue(File(mappingPath), Array<ResponseMapping>::class.java)
        .filter { it.method == method }
        .find { it.path == uri }
        ?.content
        ?: throw NotFoundException("couldn't find $uri ($method) on configuration file")

}