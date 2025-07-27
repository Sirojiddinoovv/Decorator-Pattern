package uz.nodir.decoratorpattern.model.dto.loan.request

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import uz.nodir.decoratorpattern.model.enums.LoanType


/**
@author: Nodir
@date: 27.07.2025
@group: Meloman

 **/

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "version",
    visible = true
)
@JsonSubTypes(
    value = [
        JsonSubTypes.Type(value = LoanOpenV1Request::class, name = "v1"),
        JsonSubTypes.Type(value = LoanOpenV2Request::class, name = "v2")
    ]
)
interface LoanOpenRequestDTO {

    @get:NotNull(message = "Type is required")
    val type: LoanType

    @get:Min(value = 1, message = "Amount must be greater than 0")
    val amount: Long
}