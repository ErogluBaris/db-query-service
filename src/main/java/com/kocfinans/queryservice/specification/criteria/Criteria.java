package com.kocfinans.queryservice.specification.criteria;

import com.kocfinans.queryservice.model.CriteriaModel;
import jakarta.persistence.criteria.Predicate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Criteria {

    public abstract Predicate build(CriteriaModel model);
}
