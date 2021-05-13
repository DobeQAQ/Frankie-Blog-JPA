package com.ljh.service;

import com.ljh.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    Type saveType(Type type);//新增

    Type getType(Long id);//查询

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);//分页

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id,Type type);

    void deleteType(Long id);
}
