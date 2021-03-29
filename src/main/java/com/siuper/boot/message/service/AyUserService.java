package com.siuper.boot.message.service;

import com.siuper.boot.message.model.AyUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

public interface AyUserService {
    AyUser findById(int id);

    List<AyUser> findAll();

    AyUser save(AyUser user);

    void delete(int id);

    Page<AyUser> findAll(Pageable pageable);

    List<AyUser> findByName(String name);

    List<AyUser> findByNameLike(String name);

    List<AyUser> findByIdIn(Collection<Integer> ids);
}
