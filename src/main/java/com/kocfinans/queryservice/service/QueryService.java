package com.kocfinans.queryservice.service;

import com.kocfinans.queryservice.entity.Player;
import com.kocfinans.queryservice.model.request.QueryRequest;

import java.util.List;

public interface QueryService {

    List<Player> findPlayers(QueryRequest playerQueryRequest);
}
