package uz.nodir.decoratorpattern.service.business.impl

import mu.KotlinLogging
import org.springframework.stereotype.Service
import uz.nodir.decoratorpattern.model.dto.core.response.ResultData
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.model.dto.loan.response.LoanOpenResponseDTO
import uz.nodir.decoratorpattern.service.business.LoanOpenService
import uz.nodir.decoratorpattern.service.pattern.impl.BaseLoanProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.ClientHistoryProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.FraudControlProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.SalaryProcessor


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

@Service
class LoanOpenServiceImpl : LoanOpenService {

    private val log = KotlinLogging.logger {}


    override fun open(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO> {
        log.info("Received command to open loan with request dto: $requestDTO")

        val loanProcessor =
            SalaryProcessor(
                ClientHistoryProcessor(
                    FraudControlProcessor(
                        BaseLoanProcessor()
                    )
                )
            )

        val responseDTO = loanProcessor.process(requestDTO)

        log.info("Finished command to open loan with response dto: $responseDTO")
        return responseDTO
    }
}