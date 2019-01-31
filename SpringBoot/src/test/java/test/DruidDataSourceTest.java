package test;

import com.dragon.spring.jdbc.SpringBootJdbcApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJdbcApplication.class)
public class DruidDataSourceTest {

    @Autowired
    DataSource dataSource;

    Logger logger = LoggerFactory.getLogger(DruidDataSourceTest.class);

    @Test
    public void contextLoad() throws SQLException {

        logger.error(dataSource.getClass().toString());

        Connection connection = dataSource.getConnection();
        logger.error(connection.toString());

        connection.close();
    }
}
