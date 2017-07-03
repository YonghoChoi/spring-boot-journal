# spring-boot-journal
실정 스프링 부트 워크북 (한빛미디어)의 예제 실습용 프로젝트 입니다.

## 스프링 부트 CLI 설치

1. sdkman을 통해 설치

   ```shell
   $ curl -s get.sdkman.io | bash
   ```

2. 환경 변수 등록

   ```shell
   $ source "$HOME/.sdkman/bin/sdkman-init.sh"
   ```

3. 스프링 부트 CLI 설치

   ```shell
   $ sdk install springboot
   ```

4. 설치 확인

   ```shell
   $ spring --version
   ```



## 기본 프로젝트 생성

1. Spring CLI를 사용하여 생성

   ```shell
   $ spring init --build gradle myapp
   ```

2. 이니셜라이저를 사용하여 생성

   * https://start.spring.io/
