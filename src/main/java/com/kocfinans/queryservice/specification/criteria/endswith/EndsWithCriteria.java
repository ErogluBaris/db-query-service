package com.kocfinans.queryservice.specification.criteria.endswith;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class EndsWithCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().like(
                model.root().get(model.filterInfo().getName()),
                "%" + model.filterInfo().getValue()
        );
    }
}
