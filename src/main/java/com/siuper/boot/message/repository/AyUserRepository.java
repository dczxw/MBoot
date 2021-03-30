package com.siuper.boot.message.repository;

import com.siuper.boot.message.model.AyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AyUserRepository extends JpaRepository<AyUser, Integer> {

    List<AyUser> findByName(String name);

    List<AyUser> findByNameLike(String name);

    List<AyUser> findByIdIn(Collection<Integer> ids);

}
