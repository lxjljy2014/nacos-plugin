package com.alibaba.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.plugin.datasource.enums.mysql.TrustedMysqlFunctionEnum;
import com.alibaba.nacos.plugin.datasource.mapper.AbstractMapper;

/**
 * The abstract mysql mapper contains CRUD methods.
 *
 * @author blake.qiu
 **/
public abstract class AbstractMapperByPostgresql extends AbstractMapper {

    @Override
    public String getFunction(String functionName) {
        return TrustedMysqlFunctionEnum.getFunctionByName(functionName);
    }
}