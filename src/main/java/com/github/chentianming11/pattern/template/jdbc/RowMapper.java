package com.github.chentianming11.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @author 陈添明
 * @date 2019/4/13
 */
public interface RowMapper<T> {

    /**
     * 行映射处理
     * @param rs
     * @param rowNum
     * @return
     * @throws Exception
     */
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
