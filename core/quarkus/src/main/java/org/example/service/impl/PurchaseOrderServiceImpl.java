package org.example.service.impl;

import org.example.model.PurchaseOrder;
import org.example.service.PurchaseOrderService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Override
    public List<PurchaseOrder> findAll() {
        return null;
    }

    @Override
    public PurchaseOrder findById(Integer id) {
        return null;
    }

    @Override
    public PurchaseOrder save(PurchaseOrder employee) {
        return null;
    }

    @Override
    public PurchaseOrder update(PurchaseOrder employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
