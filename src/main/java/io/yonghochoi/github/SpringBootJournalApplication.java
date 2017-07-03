package io.yonghochoi.github;

import io.yonghochoi.github.domain.Journal;
import io.yonghochoi.github.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

	// InitializingBean은 스프링 엔진이 인스턴스 생성 후 초기화 할 때 항상 호출하는 특수 메서드
	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("스트링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다", "01/01/2016"));
			repo.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어 보았다", "01/02/2016"));
			repo.save(new Journal("스트링 부트 클라우드", "클라우드 파운드리를 응용한 스프링부트를 공부했다", "03/01/2016"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
}
