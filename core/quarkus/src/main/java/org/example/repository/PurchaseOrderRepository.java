package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.PurchaseOrder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PurchaseOrderRepository  implements PanacheRepository<PurchaseOrder> {
}
