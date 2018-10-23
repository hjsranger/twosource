package com.idgcapital.rfund.deal;


import com.idgcapital.rfund.primary.dao.TermInvMapper;
import com.idgcapital.rfund.secondary.dao.FooMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jianshuang_huang on 2018/10/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DealTest {

    @Autowired
    private TermInvMapper termInvMapper;

    @Autowired
    private FooMapper fooMapper;


    @Test
    public void test(){


        System.out.println(termInvMapper.selectAll().size());
        System.out.println(fooMapper.selectAll().size());

    }

}
