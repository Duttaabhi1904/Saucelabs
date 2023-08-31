package com.sauce.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogBase {

    public static Logger logs(){
        return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }


}
