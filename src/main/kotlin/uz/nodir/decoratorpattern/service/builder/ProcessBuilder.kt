package uz.nodir.decoratorpattern.service.builder

import uz.nodir.decoratorpattern.service.pattern.LoanProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.BaseLoanProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.ClientHistoryProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.FraudControlProcessor
import uz.nodir.decoratorpattern.service.pattern.impl.SalaryProcessor


/**
@author: Nodir
@date: 01.08.2025
@group: Meloman

 **/
class ProcessBuilder {

    private var delegate: LoanProcessor = BaseLoanProcessor()

    fun fraudControl() = apply { delegate = FraudControlProcessor(delegate) }

    fun historyChecker() = apply { delegate = ClientHistoryProcessor(delegate) }

    fun salaryScoring() = apply { delegate = SalaryProcessor(delegate) }

    fun build(): LoanProcessor = delegate
}