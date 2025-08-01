package uz.nodir.decoratorpattern.model.dto.loan.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

data class LoanOpenRequestDTO(

    @JsonProperty("type")
    @field:NotNull(message = "Type is required")
    val type: LoanType,

    @JsonProperty("amount")
    @field:Min(value = 1, message = "Amount must be greater than 1")
    val amount: Long = 0L,

    @JsonProperty("description")
    @field:NotBlank(message = "Description is required")
    val description: String? = null,

    /**
     * Every month pay date
     */
    @JsonProperty("repayDate")
    val repayDate: Int? = 5
)