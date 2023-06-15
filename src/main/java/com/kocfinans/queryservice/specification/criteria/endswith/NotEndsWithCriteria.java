package com.kocfinans.queryservice.specification.criteria.endswith;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class NotEndsWithCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().notLike(
                model.root().get(model.filterInfo().getName()),
                "%" + model.filterInfo().getValue()
        );
    }
}
