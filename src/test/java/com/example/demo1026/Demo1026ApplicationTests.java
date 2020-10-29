package com.example.demo1026;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.time.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class Demo1026ApplicationTests {

	@Test
	void contextLoads() {

		System.out.println("-------------------Period Part1----------------------------");

		LocalDate startDate = LocalDate.of(1988,7,8);
		LocalDate endDate = LocalDate.now();

		//计算日期的差值
		Period period = Period.between(startDate, endDate);

		assertFalse(1 != 1);
		assertFalse(period.isNegative());

		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		System.out.println(period.toString());

		System.out.println("-------------------Period Part2----------------------------");

		Period fromUnits = Period.of(88,9,9);
		Period fromDays = Period.ofDays(788);
		Period fromWeeks = Period.ofWeeks(88);
		Period fromMonths = Period.ofMonths(77);
		Period fromYears = Period.ofYears(45);

		System.out.println(fromUnits);
		System.out.println(fromDays);
		System.out.println(fromWeeks);
		System.out.println(fromMonths);
		System.out.println(fromYears);

		System.out.println(fromUnits.getDays());
		System.out.println(fromDays.getDays());
		System.out.println(fromWeeks.getDays());
		System.out.println(fromMonths.hashCode());
		System.out.println(fromYears.hashCode());


		System.out.println("-------------------Duration  Part1----------------------------");

		Instant startInstant = Instant.ofEpochSecond(0);
		Instant endInstant = Instant.parse("1970-01-01T01:00:00.22Z");

		Duration durationD = Duration.between(startDate.atTime(2,2,2), endDate.atTime(3,3,3));
		Duration durationI = Duration.between(startInstant, endInstant);

		System.out.println(durationD);
		System.out.println(durationD.getSeconds());
		System.out.println(durationD.getNano());
		System.out.println(durationI);
		System.out.println(durationI.getSeconds());
		System.out.println(durationI.getNano());

		System.out.println("-------------------Duration  Part2----------------------------");

		LocalTime start = LocalTime.of(4,5,8,8888);
		LocalTime end = LocalTime.of(5,5,8,8887);

		Duration durationL = Duration.between(start, end);

		System.out.println(durationL.getSeconds());
		System.out.println(durationL.toMinutes());
		System.out.println(durationL.toHours());

		System.out.println("-------------------Duration  Part3----------------------------");

		Duration duration = Duration.ofMillis(58795462488L);
		System.out.println(duration.toString());
		System.out.println(duration.toDays());


	}

}
