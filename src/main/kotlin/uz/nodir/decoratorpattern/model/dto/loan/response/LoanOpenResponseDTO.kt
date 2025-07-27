package uz.nodir.decoratorpattern.model.dto.loan.response

import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/
interface LoanOpenResponseDTO {

    val type: LoanType

    val id: String

    val percent: Double
}