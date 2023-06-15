package com.kocfinans.queryservice.specification.criteria.equals;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class NotEqualsCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().notEqual(
                model.cb().lower(model.root().get(model.filterInfo().getName())), model.filterInfo().getValue()
        );
    }
}
