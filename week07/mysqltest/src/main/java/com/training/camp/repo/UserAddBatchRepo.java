package com.training.camp.repo;

import com.training.camp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserAddBatchRepo extends JpaRepository<User, Long> {

    @Transactional
    List<User> batchSave(Iterable<User> userList);
}
