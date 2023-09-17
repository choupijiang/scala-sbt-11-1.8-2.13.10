FROM sbtscala/scala-sbt:openjdk-11.0.16_1.8.0_2.13.10
MAINTAINER zhangshenghu zhangsh204@midea.com
USER root
RUN mkdir -p /root/.sbt/1.0/plugins
COPY ./plugins.sbt /root/.sbt/1.0/plugins/plugins.sbt
RUN sbt assembly
