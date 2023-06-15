package com.kocfinans.queryservice.specification.criteria.nullable;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class NullCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().isNull(
                model.cb().lower(model.root().get(model.filterInfo().getName()))
        );
    }
}
