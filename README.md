# 오라클 JDBC 라이브러리(ojdbc6.jar)
- 파일 경로 'C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib'
- 프로젝트 src/main/webapp/WEB-INF/lib 에 ojdbc6.jar 복사
- build.gradle 에 아래 코드 추가 (dependencies {} 안에 작성)
- compile fileTree(dir: '/src/main/webapp/WEB-INF/lib', includes: ['*.jar'])

```groovy
// 라이브러리 의존성 관리 (라이브러리 다운로드 설정, 로딩 설정)
dependencies {
    // 테스트 라이브러리
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'

    // 오라클 jdbc 라이브러리 설정
    compile fileTree(dir: '/src/main/webapp/WEB-INF/lib', includes: ['*.jar'])
}
```

- 데이터베이스 연결 접속정보
```
Oracle 오라클
Oracle jdbc url 
: jdbc:oracle:thin:@IP:1521:DBNAME

Oracle jdbc driverClass 
: oracle.jdbc.driver.OracleDriver


출처: https://goni9071.tistory.com/206 [고니의꿈]
```