package com.qcl.blog3.user;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by qcl on 2019-03-23
 * 微信：2501902696
 * desc:
 */
public interface UserESRepository extends ElasticsearchRepository<UserES, Long> {

}
