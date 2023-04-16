package org.example.service;

import org.example.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {

    public List<PurchaseOrder> findAll();
    public PurchaseOrder findById(final Integer id);
    public PurchaseOrder save(final PurchaseOrder employee);
    public PurchaseOrder update(final PurchaseOrder employee);
    public void deleteById(final Integer id);
}
