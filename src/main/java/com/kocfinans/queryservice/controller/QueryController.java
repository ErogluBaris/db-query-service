package com.kocfinans.queryservice.controller;

import com.kocfinans.queryservice.entity.Player;
import com.kocfinans.queryservice.model.request.QueryRequest;
import com.kocfinans.queryservice.service.QueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class QueryController {

    private final QueryService queryService;

    @PostMapping("/query")
    public List<Player> query(@RequestBody QueryRequest queryRequest) {
        return queryService.findPlayers(queryRequest);
    }
}
