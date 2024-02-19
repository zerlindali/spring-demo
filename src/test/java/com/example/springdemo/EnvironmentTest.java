package com.example.springdemo;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class EnvironmentTest {

    @Test
    public void test() {
        String startTime = "2023-12-01 00:00:00";
        String endTime = "2023-12-28 23:59:59";
        List<DateTime> range = DateUtil.rangeToList(DateUtil.parse(startTime), DateUtil.parse(endTime), DateField.DAY_OF_MONTH);
        range.stream().forEach(r -> {
            System.out.println(r.toString());
        });



        Long compare = DateUtil.betweenDay(DateUtil.parse(startTime), DateUtil.parse(endTime), true);
        System.out.println(compare);
    }
}
