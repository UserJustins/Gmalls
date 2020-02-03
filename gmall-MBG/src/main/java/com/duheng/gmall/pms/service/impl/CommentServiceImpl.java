package com.duheng.gmall.pms.service.impl;

import com.duheng.gmall.pms.entity.Comment;
import com.duheng.gmall.pms.mapper.CommentMapper;
import com.duheng.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-01-20
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
