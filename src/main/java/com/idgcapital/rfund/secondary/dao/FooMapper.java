package com.idgcapital.rfund.secondary.dao;

import com.idgcapital.rfund.secondary.model.Foo;
import java.util.List;

public interface FooMapper {
    int deleteByPrimaryKey(String id);

    int insert(Foo record);

    Foo selectByPrimaryKey(String id);

    List<Foo> selectAll();

    int updateByPrimaryKey(Foo record);
}