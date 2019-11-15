package com.unisalento.snapside.repositories;

import com.unisalento.snapside.generated.domain.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface AdRepository extends JpaRepository<AdEntity, Integer> {
    @Query("select a from AdEntity a where a.idAd=:idAd")
    public AdEntity getAdEntitiesById(@Param("idAd") int idAd);

}