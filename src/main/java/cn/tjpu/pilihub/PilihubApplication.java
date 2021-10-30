package cn.tjpu.pilihub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tjpu.pilihub.mapper")
public class PilihubApplication {

    public static void main(String[] args) {
        SpringApplication.run(PilihubApplication.class, args);
    }

}
