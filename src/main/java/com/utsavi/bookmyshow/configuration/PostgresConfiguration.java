package com.utsavi.bookmyshow.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class PostgresConfiguration {
  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.driver-class-name}")
  private String driverClassName;

  @Bean
  @Primary
  public HikariDataSource getDataSource(){
    HikariConfig hikariConfig = new HikariConfig();
    hikariConfig.setDriverClassName(driverClassName);
    hikariConfig.setUsername(username);
    hikariConfig.setPassword(password);

    hikariConfig.setJdbcUrl(url);

    return new HikariDataSource(hikariConfig);
  }
}
