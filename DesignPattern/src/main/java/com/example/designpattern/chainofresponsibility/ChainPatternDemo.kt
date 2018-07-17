package com.example.designpattern.chainofresponsibility

object ChainPatternDemo {

    @JvmStatic
    fun getChainOfLoggers(): AbstractLogger {
        var errorLogger = ErrorLogger(AbstractLogger.ERROR)
        var consoleLogger = ConsoleLogger(AbstractLogger.INFO)
        var fileLogger = FileLogger(AbstractLogger.DEBUG)

        errorLogger.setNextLogger(fileLogger)
        fileLogger.setNextLogger(consoleLogger)

        return errorLogger
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var loggerChain = getChainOfLoggers()
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
