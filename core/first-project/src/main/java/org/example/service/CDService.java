package org.example.service;

import org.example.model.CD;

import java.util.List;

public interface CDService {

    public List<CD> findAll();
    public CD findById(final Integer id);
    public CD save(final CD employee);
    public CD update(final CD employee);
    public void deleteById(final Integer id);
}
