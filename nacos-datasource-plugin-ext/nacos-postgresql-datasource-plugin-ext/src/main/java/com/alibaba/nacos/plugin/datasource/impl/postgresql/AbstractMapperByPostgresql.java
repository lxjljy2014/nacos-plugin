package com.alibaba.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.plugin.datasource.dialect.DatabaseDialect;
import com.alibaba.nacos.plugin.datasource.enums.postgresql.TrustedPostgresqlFunctionEnum;
import com.alibaba.nacos.plugin.datasource.manager.DatabaseDialectManager;
import com.alibaba.nacos.plugin.datasource.mapper.AbstractMapper;

/**
 * The abstract mysql mapper contains CRUD methods.
 *
 * @author blake.qiu
 **/
public abstract class AbstractMapperByPostgresql extends AbstractMapper {

    private final DatabaseDialect databaseDialect;

    public AbstractMapperByPostgresql() {
        databaseDialect = DatabaseDialectManager.getInstance()
                .getDialect(getDataSource());
    }

    protected DatabaseDialect getDatabaseDialect() {
        return databaseDialect;
    }

    @Override
    public String getFunction(String functionName) {
        return TrustedPostgresqlFunctionEnum.getFunctionByName(functionName);
    }
}