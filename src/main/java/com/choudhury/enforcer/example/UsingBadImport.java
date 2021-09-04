package com.choudhury.enforcer.example;

/*
 * To fix RestrictImports failure. Use ArrayList instead of the banned Vector class
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Vector;

public class UsingBadImport {
    private static final Logger logger = LogManager.getLogger(UsingBadImport.class);

    public UsingBadImport() {
        new Vector<>();
    }
}
