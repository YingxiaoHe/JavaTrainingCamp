package com.training.camp;

import com.training.camp.repo.UserAddBatchRepoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = UserAddBatchRepoImpl.class)
public class MysqltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqltestApplication.class, args);
    }

}
