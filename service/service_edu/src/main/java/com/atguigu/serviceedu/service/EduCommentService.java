package com.atguigu.serviceedu.service;

import com.atguigu.serviceedu.entity.EduComment;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 评论 服务类
 * </p>
 *
 * @author lebrwcd
 * @since 2022-05-29
 */
public interface EduCommentService extends IService<EduComment> {

    boolean saveComment(EduComment eduComment, HttpServletRequest request);
}
