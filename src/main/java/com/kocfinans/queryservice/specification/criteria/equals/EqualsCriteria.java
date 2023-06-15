package com.kocfinans.queryservice.specification.criteria.equals;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class EqualsCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().equal(
                model.root().get(model.filterInfo().getName()), model.filterInfo().getValue()
        );
    }
}
