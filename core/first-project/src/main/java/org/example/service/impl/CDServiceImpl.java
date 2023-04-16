package org.example.service.impl;

import org.example.model.CD;
import org.example.service.CDService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CDServiceImpl implements CDService {
    @Override
    public List<CD> findAll() {
        return null;
    }

    @Override
    public CD findById(Integer id) {
        return null;
    }

    @Override
    public CD save(CD employee) {
        return null;
    }

    @Override
    public CD update(CD employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
