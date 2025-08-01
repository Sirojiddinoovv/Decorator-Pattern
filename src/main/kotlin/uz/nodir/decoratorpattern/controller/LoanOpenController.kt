package uz.nodir.decoratorpattern.controller

import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.service.business.LoanOpenService


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

@RestController
@RequestMapping("/api/loan")
class LoanOpenController(
    private val loanOpenService: LoanOpenService
) {

    @PostMapping("/open")
    fun open(@RequestBody @Valid requestDTO: LoanOpenRequestDTO) =
        ResponseEntity.ok(
            loanOpenService.open(requestDTO)
        )
}