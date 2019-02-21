package comtestenglish.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("comtestenglish.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("comtestenglish")
public class DataBaseConfig {

    @Resource
    private Environment env;


}
