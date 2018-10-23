package com.idgcapital.rfund.primary.dao;

import com.idgcapital.rfund.primary.model.TermInv;
import java.util.List;

public interface TermInvMapper {
    int deleteByPrimaryKey(String termId);

    int insert(TermInv record);

    TermInv selectByPrimaryKey(String termId);

    List<TermInv> selectAll();

    int updateByPrimaryKey(TermInv record);
}