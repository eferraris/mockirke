package com.eferraris.mockirke

import com.eferraris.mockirke.enums.MethodEnum
import com.eferraris.mockirke.services.MockerService
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@SpringBootApplication
class MockerkeApplication

fun main(args: Array<String>) {
	runApplication<MockerkeApplication>(*args)
}

@RestController
class MockerkeController(
	val mockerService: MockerService
) {

	@GetMapping("/**")
	fun getMock(request: HttpServletRequest): Any = mockerService
		.findResponse(request.requestURI, MethodEnum.GET)

	@PostMapping("/**")
	fun postMock(request: HttpServletRequest): Any = mockerService
		.findResponse(request.requestURI, MethodEnum.POST)

}