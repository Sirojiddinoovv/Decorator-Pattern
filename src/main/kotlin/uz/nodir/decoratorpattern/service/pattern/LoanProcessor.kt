package uz.nodir.decoratorpattern.service.pattern

import uz.nodir.decoratorpattern.model.dto.core.response.ResultData
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.model.dto.loan.response.LoanOpenResponseDTO


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/
interface LoanProcessor {

    fun process(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO>
}