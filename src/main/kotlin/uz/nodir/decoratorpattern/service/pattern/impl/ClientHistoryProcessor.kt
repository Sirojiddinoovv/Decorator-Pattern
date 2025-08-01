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

class ClientHistoryProcessor(
    processor: LoanProcessor
) : LoanFilterProcessor(processor) {

    private val log = KotlinLogging.logger {}

    override fun process(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO> {
        log.info("Check history of client: ${requestDTO.clientId} from credit bureau")

        //todo business logic instead of Random

        if (!Random.nextBoolean()) {
            val message = "Client: ${requestDTO.clientId} credit history is bad"
            log.info("Process is finished. Cause: $message")
            return ResultData.error(1003, message)
        }

        log.info("Client is passed history checker")
        return processor.process(requestDTO)
    }
}