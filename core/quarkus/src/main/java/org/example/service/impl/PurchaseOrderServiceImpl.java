package org.example.service.impl;

import org.example.model.PurchaseOrder;
import org.example.repository.PurchaseOrderRepository;
import org.example.service.PurchaseOrderService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Inject
    private PurchaseOrderRepository purchaseOrderRepository;

    @Override
    public List<PurchaseOrder> findAll() {
        return purchaseOrderRepository.findAll().list();
    }

    @Override
    public PurchaseOrder findById(long id) {
        return purchaseOrderRepository.findById(id);
    }

    @Override
    public PurchaseOrder save(PurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public PurchaseOrder update(PurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
