package com.kocfinans.queryservice.model;

import com.kocfinans.queryservice.model.request.FilterInfo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Root;

public record CriteriaModel(CriteriaBuilder cb, Root<?> root, FilterInfo filterInfo) {

}
