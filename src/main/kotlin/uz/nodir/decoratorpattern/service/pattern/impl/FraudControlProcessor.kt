package uz.nodir.decoratorpattern.service.pattern.impl

import mu.KotlinLogging
import uz.nodir.decoratorpattern.model.dto.core.response.ResultData
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.model.dto.loan.response.LoanOpenResponseDTO
import uz.nodir.decoratorpattern.service.pattern.LoanProcessor


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/


class FraudControlProcessor(
    processor: LoanProcessor
): LoanFilterProcessor(processor) {

    private val log = KotlinLogging.logger {}

    override fun process(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO> {
        log.info("Check loan to fraud by amount: ${requestDTO.amount}")

        // todo business logic instead of amount checking
        if(requestDTO.amount > 10_000_000) {
            val message = "Amount more than 10 000 000. Application declined!"
            log.error("Process is finished. Cause: $message")
            return ResultData.error(1002, message)
        }

        log.info("Loan is passed fraud control")
        return processor.process(requestDTO)
    }
}