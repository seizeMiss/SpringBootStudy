package test;

import com.dragon.spring.configurationproperties.YamlFileApplicationContextInitializer;
import com.dragon.spring.custombean.SpringBootWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 多个SpringBootApplication,测试时需要手动指定具体哪个SpringBootApplication
 * YamlFileApplicationContextInitializer 讀取yaml配置文件，不然無法使用PropertySource獲取yaml配置文件內容
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWebApplication.class)
@ContextConfiguration(initializers = YamlFileApplicationContextInitializer.class)
public class CustomBeanTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void testHelloService() {
        boolean isExist = context.containsBean("helloService");
        System.out.println(isExist);
    }

}
