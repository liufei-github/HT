package com.gs.mybatis;

import org.apache.ibatis.datasource.pooled.PooledDataSource;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2019/2/14.
 */
public class DataSourceFactory {
    public static DataSource getDataSource(){
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8";
        String username="root";
        String pwd="hongtu";
        return new PooledDataSource(driver,url,username,pwd);
    }
}
