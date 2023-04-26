package org.example.service;

import org.example.model.CD;

import java.util.List;

public interface CDService {

    public List<CD> findAll();
    public CD findById(final long id);
    public CD save(final CD cd);
    public CD update(final CD cd);
    public void deleteById(final long id);
}
