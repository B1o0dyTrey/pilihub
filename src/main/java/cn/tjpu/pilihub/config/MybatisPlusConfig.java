package cn.tjpu.pilihub.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author FY
 * @Date 2021/10/30 10:01
 * @Version 1.0
 */

@Configuration
@MapperScan("cn.tjpu.pilihub.dao")
public class MybatisPlusConfig {
  //mybatisplus物理分页bean 暂定使用
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();

    }
}
