# Sử dụng một hình ảnh cơ sở Java
FROM openjdk:17

# Tạo thư mục /app trong hệ thống tệp Docker và đặt nó làm thư mục làm việc mặc định
WORKDIR /app/BE

# Sao chép tệp JAR của ứng dụng Spring Boot vào thư mục /app trong hệ thống tệp Docker
COPY source/target/spring-boot-docker.jar spring-boot-docker.jar

# Khởi chạy ứng dụng Spring Boot khi container được khởi động
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
