package com.design.patterns.behavioral.chainofresponsibility;

import static com.design.patterns.behavioral.chainofresponsibility.LogProcessor.*;

public class MainApp {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(
                new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(ERROR, "Hello, World!!");
        logProcessor.log(DEBUG, "Hello, World!!");
        logProcessor.log(INFO, "Hello, World!!");
    }
}
