package uz.nodir.decoratorpattern.service.pattern.impl

import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.service.pattern.LoanProcessor


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/

abstract class LoanFilterProcessor(
    val processor: LoanProcessor
) : LoanProcessor {


    override fun process(requestDTO: LoanOpenRequestDTO) =
        processor.process(requestDTO)

}