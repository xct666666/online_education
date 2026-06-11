package com.atguigu.orderservice.client;

import com.atguigu.commonutils.R;
import com.atguigu.commonutils.user.CourseWebVoOrder;
import com.atguigu.serviceedu.entity.EduCourse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("service-edu")
public interface EduClient {
    //远程调用根据课程id获得课程信息
    @PostMapping("/eduservice/coursefront/getCourseInfoOrder/{id}")
    public CourseWebVoOrder getCourseInfoOrder(@PathVariable("id") String id);


    //修改课程购买数
    @PostMapping("eduservice/coursefront/updateCourseCount")
    public R updateCourseCount(@RequestBody EduCourse eduCourse);

}
