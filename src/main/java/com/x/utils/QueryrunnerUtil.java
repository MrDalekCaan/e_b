package com.x.utils;

import org.apache.commons.dbutils.QueryRunner;

public class QueryrunnerUtil {
    public static QueryRunner getQueryrunner() {
        return new QueryRunner(DataSourceUtils.getDataSource());
    }
}
