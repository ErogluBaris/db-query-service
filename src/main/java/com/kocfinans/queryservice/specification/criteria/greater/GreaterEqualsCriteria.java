package com.kocfinans.queryservice.specification.criteria.greater;

import com.kocfinans.queryservice.model.CriteriaModel;
import com.kocfinans.queryservice.specification.criteria.Criteria;
import jakarta.persistence.criteria.Predicate;

public class GreaterEqualsCriteria extends Criteria {

    @Override
    public Predicate build(CriteriaModel model) {
        return model.cb().greaterThanOrEqualTo(model.root().get(model.filterInfo().getName())
                , (Integer) model.filterInfo().getValue());
    }
}
