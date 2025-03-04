package com.foodservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
@EntityScan("com.foodservice.app.model")
@EnableJpaRepositories("com.foodservice.app.repository")
public class AppApplication {
	public static void main(String[] args) {SpringApplication.run(AppApplication.class, args);}
}