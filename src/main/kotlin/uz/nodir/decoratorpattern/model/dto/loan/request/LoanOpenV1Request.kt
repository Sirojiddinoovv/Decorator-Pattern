package uz.nodir.decoratorpattern.model.dto.loan.request

import com.fasterxml.jackson.annotation.JsonProperty
import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

data class LoanOpenV1Request(
    @JsonProperty("type")
    override val type: LoanType,

    @JsonProperty("amount")
    override val amount: Long = 0L,

    @JsonProperty("name")
    val name: String? = null,
) : LoanOpenRequestDTO {


}