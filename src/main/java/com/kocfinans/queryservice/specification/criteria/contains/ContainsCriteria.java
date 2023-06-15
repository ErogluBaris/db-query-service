package com.kocfinans.queryservice.specification.criteria.contains;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class ContainsCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().like(
                model.root().get(model.filterInfo().getName()),
                "%" + model.filterInfo().getValue() + "%"
        );
    }
}
