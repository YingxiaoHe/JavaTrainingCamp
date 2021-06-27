package com.training.camp.repo;

import com.training.camp.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
@NoRepositoryBean
public class UserAddBatchRepoImpl<T, ID extends Serializable> extends SimpleJpaRepository<User, Long>
        implements UserAddBatchRepo {

    // 持久化上下文
    private final EntityManager entityManager;
    private final JpaEntityInformation<T, ?> entityInformation;

    public UserAddBatchRepoImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super((JpaEntityInformation<User, ?>) entityInformation, entityManager);
        this.entityInformation = entityInformation;
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<User> batchSave(Iterable<User> userList) {
        for (User user : userList) {
            entityManager.persist(user);
            entityManager.flush();
            entityManager.clear();
        }
        List<User> list = new ArrayList<>();
        userList.forEach(list::add);
        return list;
    }
}
