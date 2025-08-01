package uz.nodir.decoratorpattern.model.dto.loan.response

import com.fasterxml.jackson.annotation.JsonInclude
import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
data class LoanOpenResponseDTO(
    val type: LoanType,
    val id: String,
    val percent: Double,
    val period: Int,
    val gracePeriod: Int,
    val nearestAmount: Long
)