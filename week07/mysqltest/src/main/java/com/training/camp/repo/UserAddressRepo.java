package com.training.camp.repo;

import com.training.camp.model.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepo extends JpaRepository<UserAddress, Long> {
}
