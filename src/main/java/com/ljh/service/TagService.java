package com.ljh.service;

import com.ljh.entity.Tag;
import com.ljh.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    Tag saveTag(Tag tag);//新增

    Tag getTag(Long id);//查询

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);//分页

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

    Tag updateTag(Long id,Tag tag);

    void deleteTag(Long id);
}
