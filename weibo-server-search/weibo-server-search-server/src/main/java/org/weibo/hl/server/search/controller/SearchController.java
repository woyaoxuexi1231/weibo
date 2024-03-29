package org.weibo.hl.server.search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.weibo.hl.core.pojo.ResultDTO;
import org.weibo.hl.core.util.ResultDTOBuilder;
import org.weibo.hl.server.search.api.model.req.SearchReqDTO;
import org.weibo.hl.server.search.api.model.rsp.SearchRspDTO;
import org.weibo.hl.server.search.api.service.SearchService;

import javax.annotation.Resource;

/**
 * @projectName: weibo
 * @package: org.weibo.hl.server.controller
 * @className: SearchController
 * @description:
 * @author: hl
 * @createDate: 2023/5/14 20:54
 */

@RestController
public class SearchController {

    @Resource
    SearchService searchService;

    @GetMapping("/getSearchResult")
    public ResultDTO<?> getSearchResult(SearchReqDTO req) {
        SearchRspDTO rsp = searchService.getSearchResult(req);
        return ResultDTOBuilder.resultSuccessBuild(rsp);
    }
}
