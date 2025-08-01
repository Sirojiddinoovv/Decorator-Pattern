package uz.nodir.decoratorpattern.service.business

import uz.nodir.decoratorpattern.model.dto.core.response.ResultData
import uz.nodir.decoratorpattern.model.dto.loan.request.LoanOpenRequestDTO
import uz.nodir.decoratorpattern.model.dto.loan.response.LoanOpenResponseDTO


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/
interface LoanOpenService {

    fun open(requestDTO: LoanOpenRequestDTO): ResultData<LoanOpenResponseDTO>
}