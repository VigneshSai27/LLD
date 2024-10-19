package com.design.patterns.behavioral.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) System.out.println("Info: " + message);
        else super.log(logLevel, message);
    }
}
