# **환경설정**

## **기본 정보**
- **Build Tool**: Gradle  
- **Spring Boot Version**: 3.4.2  
- **Packaging**: Jar  
- **Java Version**: 17  
- **JDK**: Amazon Corretto 17  
- **Database**: MySQL (8.4.4)  

---

## **테스트 환경**
- 테스트는 간단히 하기 위해서 **H2 데이터베이스**에서 실행했습니다.
- 테스트 완료 항목:
  - **ModelMapper**
  - **Querydsl**
  - **JpaRepository**

---

## **참고 사항**
- 부족한 부분이 있을 수 있으니, 직접 실행해보시고 에러 알려주시면 수정하겠습니다.
- **P6Spy**도 포함했으나, 필요 없으시면 생략 가능합니다.
- `application.yml` 파일은 임의로 설정해두었습니다.
