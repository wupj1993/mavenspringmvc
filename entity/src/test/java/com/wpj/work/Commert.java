package com.wpj.work;

import com.wpj.work.dao.TCommentMapper;
import org.junit.Test;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/26.16:41
 * ****************************************************
 */
public class Commert extends TestFather {
    @Resource
    private TCommentMapper tCommentMapper;
    @Test
    public void a(){
        System.out.println(tCommentMapper+"------------");
    }
}
