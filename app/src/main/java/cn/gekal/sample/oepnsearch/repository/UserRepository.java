package cn.gekal.sample.oepnsearch.repository;

import cn.gekal.sample.oepnsearch.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    // カスタムクエリが必要な場合、メソッドを追加できます。
}