package com.siuper.boot.message.service.impl;

import com.siuper.boot.message.model.AyUser;
import com.siuper.boot.message.repository.AyUserRepository;
import com.siuper.boot.message.service.AyUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class AyUserServiceImp implements AyUserService {

    @Resource
    private AyUserRepository repository;

    @Override
    public AyUser findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<AyUser> findAll() {
        return repository.findAll();
    }

    @Override
    public AyUser save(AyUser user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Page<AyUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AyUser> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<AyUser> findByNameLike(String name) {
        return repository.findByNameLike(name);
    }

    @Override
    public List<AyUser> findByIdIn(Collection<Integer> ids) {
        return repository.findByIdIn(ids);
    }
}
