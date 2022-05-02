FROM openjdk:8-jre-slim
ENV TZ=Asia/Shanghai
#VOLUME /tmp
COPY ./target/hello-0.0.1.jar hello.jar
RUN echo $(date +'%Y-%m%d-%H%M') > /image_built_at
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","hello.jar"]
