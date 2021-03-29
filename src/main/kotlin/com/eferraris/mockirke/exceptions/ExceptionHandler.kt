package com.eferraris.mockirke.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import java.lang.StringBuilder

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(Exception::class)
    private fun handleException(exception: Exception, webRequest: WebRequest): ResponseEntity<String?> {

        exception.printStackTrace()

        return ResponseEntity<String?>("something strange is happening", HttpStatus.INTERNAL_SERVER_ERROR)

    }

    @ExceptionHandler(NotFoundException::class)
    private fun handleException(exception: NotFoundException, webRequest: WebRequest): ResponseEntity<String?> {

        exception.printStackTrace()

        return ResponseEntity<String?>(exception.message, HttpStatus.NOT_FOUND)

    }

}