package edu.ustb.blog.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {// 静态代码块，特点：运行一次。加载数据源对象
        try {
            InputStream inputStream = Resources.getResourceAsStream("/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

}
