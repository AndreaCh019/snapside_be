package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}
