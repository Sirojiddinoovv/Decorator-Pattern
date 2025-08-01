package uz.nodir.decoratorpattern.service.pattern.impl

import mu.KotlinLogging
import uz.nodir.decoratorpattern.model.dto.core.response.ResultData
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.model.dto.loan.response.LoanOpenResponseDTO
import uz.nodir.decoratorpattern.service.pattern.LoanProcessor
import kotlin.random.Random


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/

class SalaryProcessor(
    processor: LoanProcessor
) : LoanFilterProcessor(processor) {

    private val log = KotlinLogging.logger {}

    override fun process(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO> {
        log.info("Salary scoring by clientId: ${requestDTO.clientId}")

        // todo business logic instead of Random
        val salary = Random.nextInt(1_000_000, 20_000_000)

        if (salary < 8_000_000) {
            val message = "Client salary is less than expected"
            log.error("Process is finished. Cause: $message")
            return ResultData.error(1004, message)
        }

        log.info("Client is passed salary scoring")
        return processor.process(requestDTO)
    }
}