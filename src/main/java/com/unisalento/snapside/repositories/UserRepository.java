package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
