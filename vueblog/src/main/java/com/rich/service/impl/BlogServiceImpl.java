package com.rich.service.impl;

import com.rich.entity.Blog;
import com.rich.mapper.BlogMapper;
import com.rich.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rich
 * @since 2021-07-17
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
