package uz.nodir.decoratorpattern.model.dto.loan.response

import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

data class LoanOpenV1Response(
    override val type: LoanType,
    override val id: String,
    override val percent: Double,
    val period: Int
) : LoanOpenResponseDTO