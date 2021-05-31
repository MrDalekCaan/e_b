package com.x.utils;

public class DefaultValue {
    public static Object d(Object testObj, Object defaultOjb) {
        if (testObj == null) {
            return defaultOjb;
        }
        else return testObj;
    }
}
