package org.example.service.impl;

import org.example.model.CD;
import org.example.repository.CDRepository;
import org.example.service.CDService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CDServiceImpl implements CDService {

    @Inject
    CDRepository cdRepository;

    @Override
    public List<CD> findAll() {
        return cdRepository.findAll().list();
    }

    @Override
    public CD findById(long id) {
        return cdRepository.findById(id);
    }

    @Override
    public CD save(CD cd) {
        return null;
    }

    @Override
    public CD update(CD cd) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
