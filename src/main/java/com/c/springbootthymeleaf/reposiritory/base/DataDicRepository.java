package com.c.springbootthymeleaf.reposiritory.base;

import com.c.springbootthymeleaf.domain.base.DataDic;
import com.c.springbootthymeleaf.reposiritory.BaseRepository;

public interface DataDicRepository extends BaseRepository<DataDic,Long> {

    DataDic findByDataCode(String dataCode);

}
