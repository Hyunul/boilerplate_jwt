# BoilerPlate with JWT Authentication

## 소개

이 저장소는 향후 개발될 서버 및 사이트의 개발 속도를 비약적으로 향상시키기 위한 보일러플레이트입니다. 

## 구현 기능

1. **JWT 기반 인증 시스템**: AccessToken 및 RefreshToken을 활용한 회원가입, 로그인, 로그아웃 기능을 제공합니다.
2. **예외 처리**: 다양한 예외 상황에 대한 처리를 구현하여 안정적인 시스템 운영을 도모합니다.

## 시작하기

### 사전 요구 사항

- Java 11 이상
- Gradle

### 설치 및 실행

1. 저장소를 클론합니다:

   ```bash
   git clone https://github.com/Hyunul/boilerplate_jwt.git
   cd boilerplate_jwt
   ```

2. Gradle을 통해 프로젝트를 빌드하고 실행합니다:

   ```bash
   ./gradlew build
   ./gradlew bootRun
   ```

## 사용 방법

### 회원가입

- **Endpoint**: `/api/register`
- **Method**: `POST`
- **Request Body**:

  ```json
  {
    "email": "user@example.com",
    "password": "your_password"
  }
  ```

- **Response**: 성공 시 JWT AccessToken과 RefreshToken이 반환됩니다.

### 로그인

- **Endpoint**: `/api/login`
- **Method**: `POST`
- **Request Body**:

  ```json
  {
    "email": "user@example.com",
    "password": "your_password"
  }
  ```

- **Response**: 성공 시 JWT AccessToken과 RefreshToken이 반환됩니다.

### 로그아웃

- **Endpoint**: `/api/logout`
- **Method**: `POST`
- **Header**: `Authorization: Bearer {accessToken}`
- **Response**: 성공 시 로그아웃이 완료되었다는 메시지가 반환됩니다.

## 디렉토리 구조

```
boilerplate_jwt/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
├── build.gradle
├── settings.gradle
└── README.md
```

- `src/main/java/`: Java 소스 코드 디렉토리
- `src/main/resources/`: 설정 및 리소스 파일 디렉토리
- `build.gradle`: Gradle 빌드 설정 파일
- `settings.gradle`: Gradle 설정 파일

## 기여 방법

1. 이 저장소를 포크합니다.
2. 새로운 브랜치를 생성합니다: `git checkout -b feature/새로운기능`
3. 변경 사항을 커밋합니다: `git commit -m '새로운 기능 추가'`
4. 브랜치에 푸시합니다: `git push origin feature/새로운기능`
5. Pull Request를 생성합니다.

## 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다. 자세한 내용은 `LICENSE` 파일을 참조하세요.

## 문의

프로젝트와 관련된 문의 사항은 저장소의 이슈 탭을 통해 제출해 주세요. 
