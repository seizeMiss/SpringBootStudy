package test;

import com.dragon.spring.configurationproperties.YamlFileApplicationContextInitializer;
import com.dragon.spring.custombean.SpringBootWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 一个项目有多个SpringBootApplication,测试类需要手动指定具体哪个SpringBootApplication
 * YamlFileApplicationContextInitializer 读取yaml配置文件，不然无法使用PropertySource获取yaml配置文件內容
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWebApplication.class)
@ContextConfiguration(initializers = YamlFileApplicationContextInitializer.class)
public class CustomBeanTest {
    @Autowired
    ApplicationContext context;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void testHelloService() {
        // 日志的级别
        // 由低到高 trace < debug < info < warn < error
        // 可以调整输出的日志级别；日志只会在这个级别以后的高级别生效
        logger.trace("start......");
        logger.debug("start......");
        // SpringBoot默认级别是info级别（root级别）
        logger.info("start......");
        logger.warn("start......");
        logger.error("start......");
        boolean isExist = context.containsBean("helloService");
        logger.error("end....." + isExist);
    }

}
