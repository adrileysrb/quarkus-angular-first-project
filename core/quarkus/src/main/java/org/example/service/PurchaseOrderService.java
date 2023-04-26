package org.example.service;

import org.example.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {

    public List<PurchaseOrder> findAll();
    public PurchaseOrder findById(final long id);
    public PurchaseOrder save(final PurchaseOrder purchaseOrder);
    public PurchaseOrder update(final PurchaseOrder purchaseOrder);
    public void deleteById(final long id);
}
