package test;

import com.dragon.spring.configurationproperties.Person;
import com.dragon.spring.configurationproperties.YamlFileApplicationContextInitializer;
import com.dragon.spring.configurationproperties.SpringBootWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 項目中有多个SpringBootApplication启动类,测试时需要手动指定具体哪个启动类
 * YamlFileApplicationContextInitializer 读取yaml配置文件，不然無法使用PropertySource获取yaml配置文件內容
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWebApplication.class)
@ContextConfiguration(initializers = YamlFileApplicationContextInitializer.class)
public class SpringBootApplicationTest {
    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
