package uz.nodir.decoratorpattern.model.dto.core.response

import com.fasterxml.jackson.annotation.JsonInclude


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResultData<R>(

    val isSuccess: Boolean,

    val data: R?,

    val error: CoreError?
) {

    companion object {

        fun <R> ok(data: R) =
            ResultData(true, data, null)

        fun <R> error(code: Int, message: String): ResultData<R> =
            ResultData(false, null, CoreError(code, message))
    }
}