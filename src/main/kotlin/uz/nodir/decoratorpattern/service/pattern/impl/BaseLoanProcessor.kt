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
class BaseLoanProcessor: LoanProcessor {

    private val log = KotlinLogging.logger {}

    override fun process(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO> {
        log.info("Process to open loan: ${requestDTO.type} with amount: ${requestDTO.amount}")

        //todo business logic

        val period = Random.nextInt(12, 36)

        val response = LoanOpenResponseDTO(
            type = requestDTO.type,
            id = Random.nextInt(100000, 9999999).toString(),
            percent = Random.nextDouble(10.0, 11.0),
            period = period,
            gracePeriod = Random.nextInt(1, 6),
            nearestAmount = requestDTO.amount / period
        )

        log.info("Opened loan for $period months period")
        return ResultData.ok(response)
    }
}