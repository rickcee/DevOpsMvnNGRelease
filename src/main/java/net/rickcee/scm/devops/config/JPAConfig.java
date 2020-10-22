/**
 * 
 */
package net.rickcee.scm.devops.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author rickcee
 *
 */
@Configuration
@ConditionalOnClass(DataSource.class)
@ComponentScan(basePackages = { "net.rickcee.scm.devops.model" })
@EnableJpaRepositories(basePackages = {"net.rickcee.scm.devops.repository"})
@EnableTransactionManagement
public class JPAConfig {

}
