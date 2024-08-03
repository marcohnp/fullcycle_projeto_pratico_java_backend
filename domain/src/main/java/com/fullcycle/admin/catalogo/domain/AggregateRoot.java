package com.fullcycle.admin.catalogo.domain;

import com.fullcycle.admin.catalogo.domain.validation.ValidationHandler;

public abstract class AggregateRoot <ID extends Identifier> extends Entity<ID> {
    protected AggregateRoot(ID id) {
        super(id);
    }
}
