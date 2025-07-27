package uz.nodir.decoratorpattern.model.dto.loan.request

import com.fasterxml.jackson.annotation.JsonProperty
import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

data class LoanOpenV2Request(

    @JsonProperty("type")
    override val type: LoanType,

    @JsonProperty("amount")
    override val amount: Long = 0L,

    @JsonProperty("description")
    val description: String? = null,

    /**
     * Every month pay date
     */
    @JsonProperty("repayDate")
    val repayDate: Int? = 5
) : LoanOpenRequestDTO {


}