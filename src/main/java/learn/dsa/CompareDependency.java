package learn.dsa;

import java.util.HashMap;
import java.util.Map;

public class CompareDependency {
    public static void main(String[] args) {

//String ccmDep = "Gradle: com.fasterxml.jackson.core:jackson-annotations:2.18.2Gradle: com.fasterxml.jackson.core:jackson-core:2.18.2Gradle: com.fasterxml.jackson.core:jackson-databind:2.18.2Gradle: com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.18.2Gradle: com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.2Gradle: com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:2.18.2Gradle: com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.18.2Gradle: com.fasterxml.jackson.module:jackson-module-jaxb-annotations:2.18.2Gradle: com.github.ulisesbocchio:jasypt-spring-boot:3.0.5Gradle: com.github.ulisesbocchio:jasypt-spring-boot-starter:3.0.5Gradle: com.googlecode.json-simple:json-simple:1.1.1Gradle: com.jayway.jsonpath:json-path:2.9.0Gradle: com.lmax:disruptor:3.4.4Gradle: com.vaadin.external.google:android-json:0.0.20131108.vaadin1Gradle: io.dropwizard.metrics:metrics-core:4.2.22Gradle: io.dropwizard.metrics:metrics-jmx:4.2.22Gradle: io.github.classgraph:classgraph:4.8.176Gradle: io.micrometer:micrometer-core:1.9.17Gradle: io.micrometer:micrometer-registry-jmx:1.9.17Gradle: io.swagger.core.v3:swagger-annotations:2.2.26Gradle: io.swagger.core.v3:swagger-core:2.2.26Gradle: io.swagger.core.v3:swagger-integration:2.2.26Gradle: io.swagger.core.v3:swagger-jaxrs2:2.2.26Gradle: io.swagger.core.v3:swagger-models:2.2.26Gradle: jakarta.activation:jakarta.activation-api:1.2.2Gradle: jakarta.annotation:jakarta.annotation-api:1.3.5Gradle: jakarta.validation:jakarta.validation-api:2.0.2Gradle: jakarta.xml.bind:jakarta.xml.bind-api:2.3.3Gradle: javax.activation:javax.activation-api:1.2.0Gradle: javax.xml.bind:jaxb-api:2.3.1Gradle: net.bytebuddy:byte-buddy:1.15.4Gradle: net.bytebuddy:byte-buddy-agent:1.15.4Gradle: net.minidev:accessors-smart:2.5.0Gradle: net.minidev:json-smart:2.5.0Gradle: org.apache.commons:commons-lang3:3.17.0Gradle: org.apache.logging.log4j:log4j-api:2.24.2Gradle: org.apache.logging.log4j:log4j-core:2.24.2Gradle: org.apache.logging.log4j:log4j-jul:2.24.2Gradle: org.apache.logging.log4j:log4j-slf4j2-impl:2.24.2Gradle: org.apache.tomcat.embed:tomcat-embed-core:9.0.97Gradle: org.apache.tomcat.embed:tomcat-embed-el:9.0.97Gradle: org.apache.tomcat.embed:tomcat-embed-websocket:9.0.97Gradle: org.apiguardian:apiguardian-api:1.1.2Gradle: org.assertj:assertj-core:3.26.3Gradle: org.fusesource.jansi:jansi:2.4.1Gradle: org.hamcrest:hamcrest:3.0Gradle: org.hdrhistogram:HdrHistogram:2.1.12Gradle: org.jasypt:jasypt:1.9.3Gradle: org.javassist:javassist:3.30.2-GAGradle: org.jetbrains:annotations:26.0.1Gradle: org.jolokia:jolokia-core:1.7.2Gradle: org.jspecify:jspecify:1.0.0Gradle: org.junit.jupiter:junit-jupiter:5.11.3Gradle: org.junit.jupiter:junit-jupiter-api:5.11.3Gradle: org.junit.jupiter:junit-jupiter-engine:5.11.3Gradle: org.junit.jupiter:junit-jupiter-params:5.11.3Gradle: org.junit.platform:junit-platform-commons:1.11.3Gradle: org.junit.platform:junit-platform-engine:1.11.3Gradle: org.latencyutils:LatencyUtils:2.0.3Gradle: org.mockito:mockito-core:5.14.2Gradle: org.mockito:mockito-junit-jupiter:5.14.2Gradle: org.objenesis:objenesis:3.3Gradle: org.opentest4j:opentest4j:1.3.0Gradle: org.ow2.asm:asm:9.3Gradle: org.skyscreamer:jsonassert:1.5.3Gradle: org.slf4j:jul-to-slf4j:2.0.16Gradle: org.slf4j:slf4j-api:2.0.16Gradle: org.springframework.boot:spring-boot:2.7.18Gradle: org.springframework.boot:spring-boot-actuator:2.7.18Gradle: org.springframework.boot:spring-boot-actuator-autoconfigure:2.7.18Gradle: org.springframework.boot:spring-boot-autoconfigure:2.7.18Gradle: org.springframework.boot:spring-boot-starter:2.7.18Gradle: org.springframework.boot:spring-boot-starter-actuator:2.7.18Gradle: org.springframework.boot:spring-boot-starter-log4j2:2.7.18Gradle: org.springframework.boot:spring-boot-starter-test:2.7.18Gradle: org.springframework.boot:spring-boot-starter-tomcat:2.7.18Gradle: org.springframework.boot:spring-boot-test:2.7.18Gradle: org.springframework.boot:spring-boot-test-autoconfigure:2.7.18Gradle: org.springframework:spring-aop:5.3.39Gradle: org.springframework:spring-beans:5.3.39Gradle: org.springframework:spring-context:5.3.39Gradle: org.springframework:spring-core:5.3.39Gradle: org.springframework:spring-expression:5.3.39Gradle: org.springframework:spring-jcl:5.3.39Gradle: org.springframework:spring-test:5.3.39Gradle: org.xmlunit:xmlunit-core:2.9.1Gradle: org.yaml:snakeyaml:2.3";

//        String bisDep1 = "Maven:1.2.3Maven:2.3.4Maven 3.2.5Maven 5.4.5";
//        String bisDep = "Maven: ch.qos.logback.contrib:logback-jackson:0.1.5Maven: ch.qos.logback.contrib:logback-json-classic:0.1.5Maven: ch.qos.logback.contrib:logback-json-core:0.1.5Maven: ch.qos.logback:logback-access:1.2.13Maven: ch.qos.logback:logback-classic:1.2.13Maven: ch.qos.logback:logback-core:1.2.13Maven: com.cox.amp.api:commons-exception:2.2.54Maven: com.cox.amp.api:commons-legacy:1.3.38Maven: com.cox.amp.api:commons-logging:2.2.65Maven: com.cox.amp.api:commons-newrelic:1.3.11Maven: com.fasterxml.jackson.core:jackson-annotations:2.13.5Maven: com.fasterxml.jackson.core:jackson-core:2.15.0Maven: com.fasterxml.jackson.core:jackson-databind:2.13.5Maven: com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.5Maven: com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.5Maven: com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.13.5Maven: com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.5Maven: com.fasterxml.jackson.module:jackson-module-parameter-names:2.13.5Maven: com.fasterxml.woodstox:woodstox-core:6.4.0Maven: com.fasterxml:classmate:1.5.1Maven: com.google.guava:guava:20.0Maven: com.jayway.jsonpath:json-path:2.7.0Maven: com.microsoft.sqlserver:mssql-jdbc:10.2.3.jre8Maven: com.newrelic.agent.java:newrelic-api:7.11.1Maven: com.oracle.database.jdbc:ojdbc8:21.5.0.0Maven: com.sun.activation:jakarta.activation:1.2.2Maven: com.sun.xml.bind:jaxb-core:2.3.0.1Maven: com.sun.xml.bind:jaxb-impl:2.3.9Maven: com.sun.xml.messaging.saaj:saaj-impl:1.5.3Maven: com.vaadin.external.google:android-json:0.0.20131108.vaadin1Maven: com.zaxxer:HikariCP:4.0.3Maven: commons-codec:commons-codec:1.15Maven: io.github.classgraph:classgraph:4.8.138Maven: io.micrometer:micrometer-core:1.9.17Maven: io.netty:netty-buffer:4.1.101.FinalMaven: io.netty:netty-codec:4.1.101.FinalMaven: io.netty:netty-codec-dns:4.1.101.FinalMaven: io.netty:netty-codec-http2:4.1.101.FinalMaven: io.netty:netty-codec-http:4.1.101.FinalMaven: io.netty:netty-codec-socks:4.1.101.FinalMaven: io.netty:netty-common:4.1.101.FinalMaven: io.netty:netty-handler:4.1.101.FinalMaven: io.netty:netty-handler-proxy:4.1.101.FinalMaven: io.netty:netty-resolver:4.1.101.FinalMaven: io.netty:netty-resolver-dns:4.1.101.FinalMaven: io.netty:netty-resolver-dns-classes-macos:4.1.101.FinalMaven: io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.101.FinalMaven: io.netty:netty-transport:4.1.101.FinalMaven: io.netty:netty-transport-classes-epoll:4.1.101.FinalMaven: io.netty:netty-transport-native-epoll:linux-x86_64:4.1.101.FinalMaven: io.netty:netty-transport-native-unix-common:4.1.101.FinalMaven: io.projectreactor.netty:reactor-netty-core:1.0.39Maven: io.projectreactor.netty:reactor-netty-http:1.0.39Maven: io.projectreactor:reactor-core:3.4.34Maven: io.springfox:springfox-core:2.9.2Maven: io.springfox:springfox-schema:2.9.2Maven: io.springfox:springfox-spi:2.9.2Maven: io.springfox:springfox-spring-web:2.9.2Maven: io.springfox:springfox-swagger2:2.9.2Maven: io.springfox:springfox-swagger-common:2.9.2Maven: io.springfox:springfox-swagger-ui:2.9.2Maven: io.swagger.core.v3:swagger-annotations:2.1.12Maven: io.swagger.core.v3:swagger-core:2.1.12Maven: io.swagger.core.v3:swagger-models:2.1.12Maven: io.swagger:swagger-annotations:1.5.20Maven: io.swagger:swagger-models:1.5.20Maven: jakarta.activation:jakarta.activation-api:1.2.2Maven: jakarta.annotation:jakarta.annotation-api:1.3.5Maven: jakarta.jws:jakarta.jws-api:2.1.0Maven: jakarta.validation:jakarta.validation-api:2.0.2Maven: jakarta.xml.bind:jakarta.xml.bind-api:2.3.3Maven: jakarta.xml.soap:jakarta.xml.soap-api:1.4.2Maven: jakarta.xml.ws:jakarta.xml.ws-api:2.3.3Maven: javax.activation:javax.activation-api:1.2.0Maven: javax.xml.bind:jaxb-api:2.3.1Maven: joda-time:joda-time:2.10.6Maven: net.bytebuddy:byte-buddy:1.12.23Maven: net.bytebuddy:byte-buddy-agent:1.12.23Maven: net.minidev:accessors-smart:2.4.11Maven: net.minidev:json-smart:2.4.11Maven: net.sf.jt400:jt400:10.7Maven: org.apache.commons:commons-lang3:3.5Maven: org.apache.httpcomponents:httpclient:4.5.14Maven: org.apache.httpcomponents:httpcore:4.4.16Maven: org.apache.logging.log4j:log4j-api:2.17.2Maven: org.apache.logging.log4j:log4j-to-slf4j:2.17.2Maven: org.apache.tomcat.embed:tomcat-embed-core:9.0.83Maven: org.apache.tomcat.embed:tomcat-embed-el:9.0.83Maven: org.apache.tomcat.embed:tomcat-embed-websocket:9.0.83Maven: org.apiguardian:apiguardian-api:1.1.2Maven: org.assertj:assertj-core:3.22.0Maven: org.codehaus.janino:commons-compiler:3.1.10Maven: org.codehaus.janino:janino:3.1.10Maven: org.codehaus.woodstox:stax2-api:4.2.1Maven: org.hamcrest:hamcrest:2.2Maven: org.hdrhistogram:HdrHistogram:2.1.12Maven: org.hibernate.validator:hibernate-validator:6.2.5.FinalMaven: org.jboss.logging:jboss-logging:3.4.3.FinalMaven: org.junit.jupiter:junit-jupiter:5.8.2Maven: org.junit.jupiter:junit-jupiter-api:5.8.2Maven: org.junit.jupiter:junit-jupiter-engine:5.8.2Maven: org.junit.jupiter:junit-jupiter-params:5.8.2Maven: org.junit.platform:junit-platform-commons:1.8.2Maven: org.junit.platform:junit-platform-engine:1.8.2Maven: org.jvnet.staxex:stax-ex:1.8.3Maven: org.latencyutils:LatencyUtils:2.0.3Maven: org.mapstruct:mapstruct:1.2.0.FinalMaven: org.mockito:mockito-core:4.5.1Maven: org.mockito:mockito-junit-jupiter:4.5.1Maven: org.objenesis:objenesis:3.2Maven: org.opentest4j:opentest4j:1.2.0Maven: org.ow2.asm:asm:9.3Maven: org.projectlombok:lombok:1.18.30Maven: org.reactivestreams:reactive-streams:1.0.4Maven: org.skyscreamer:jsonassert:1.5.1Maven: org.slf4j:jul-to-slf4j:1.7.36Maven: org.slf4j:slf4j-api:1.7.36Maven: org.springdoc:springdoc-openapi-common:1.6.6Maven: org.springdoc:springdoc-openapi-ui:1.6.6Maven: org.springdoc:springdoc-openapi-webmvc-core:1.6.6Maven: org.springframework.boot:spring-boot:2.7.18Maven: org.springframework.boot:spring-boot-actuator:2.7.18Maven: org.springframework.boot:spring-boot-actuator-autoconfigure:2.7.18Maven: org.springframework.boot:spring-boot-autoconfigure:2.7.18Maven: org.springframework.boot:spring-boot-starter:2.7.18Maven: org.springframework.boot:spring-boot-starter-actuator:2.7.18Maven: org.springframework.boot:spring-boot-starter-cache:2.7.18Maven: org.springframework.boot:spring-boot-starter-jdbc:2.7.18Maven: org.springframework.boot:spring-boot-starter-json:2.7.18Maven: org.springframework.boot:spring-boot-starter-logging:2.7.18Maven: org.springframework.boot:spring-boot-starter-reactor-netty:2.7.18Maven: org.springframework.boot:spring-boot-starter-test:2.7.18Maven: org.springframework.boot:spring-boot-starter-tomcat:2.7.18Maven: org.springframework.boot:spring-boot-starter-validation:2.7.18Maven: org.springframework.boot:spring-boot-starter-web:2.7.18Maven: org.springframework.boot:spring-boot-starter-web-services:2.7.18Maven: org.springframework.boot:spring-boot-starter-webflux:2.7.18Maven: org.springframework.boot:spring-boot-test:2.7.18Maven: org.springframework.boot:spring-boot-test-autoconfigure:2.7.18Maven: org.springframework.plugin:spring-plugin-core:1.2.0.RELEASEMaven: org.springframework.plugin:spring-plugin-metadata:1.2.0.RELEASEMaven: org.springframework.ws:spring-ws-core:3.1.8Maven: org.springframework.ws:spring-xml:3.1.8Maven: org.springframework:spring-aop:5.3.31Maven: org.springframework:spring-beans:5.3.31Maven: org.springframework:spring-context:5.3.31Maven: org.springframework:spring-context-support:5.3.31Maven: org.springframework:spring-core:5.3.31Maven: org.springframework:spring-expression:5.3.31Maven: org.springframework:spring-jcl:5.3.31Maven: org.springframework:spring-jdbc:5.3.31Maven: org.springframework:spring-oxm:5.3.31Maven: org.springframework:spring-test:5.3.31Maven: org.springframework:spring-tx:5.3.31Maven: org.springframework:spring-web:5.3.31Maven: org.springframework:spring-webflux:5.3.31Maven: org.springframework:spring-webmvc:5.3.31Maven: org.webjars:swagger-ui:4.5.0Maven: org.webjars:webjars-locator-core:0.50Maven: org.xmlunit:xmlunit-core:2.9.1Maven: org.yaml:snakeyaml:2.0\n";

        String ccmDep = "Gradle: ch.qos.logback.contrib:logback-jackson:0.1.5,\n" +
                "Gradle: ch.qos.logback.contrib:logback-json-classic:0.1.5,\n" +
                "Gradle: ch.qos.logback.contrib:logback-json-core:0.1.5,\n" +
                "Gradle: ch.qos.logback:logback-access:1.2.13,\n" +
                "Gradle: ch.qos.logback:logback-classic:1.2.13,\n" +
                "Gradle: ch.qos.logback:logback-core:1.2.13,\n" +
                "Gradle: com.cox.amp.api:commons-exception:2.2.54,\n" +
                "Gradle: com.cox.amp.api:commons-legacy:1.3.38,\n" +
                "Gradle: com.cox.amp.api:commons-logging:2.3.66,\n" +
                "Gradle: com.cox.amp.api:commons-newrelic:1.3.11,\n" +
                "Gradle: com.fasterxml.jackson.core:jackson-annotations:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.core:jackson-core:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.core:jackson-databind:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.module:jackson-module-jaxb-annotations:2.18.2,\n" +
                "Gradle: com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.2,\n" +
                "Gradle: com.fasterxml.woodstox:woodstox-core:7.1.0,\n" +
                "Gradle: com.fasterxml:classmate:1.5.1,\n" +
                "Gradle: com.github.ulisesbocchio:jasypt-spring-boot:3.0.5,\n" +
                "Gradle: com.github.ulisesbocchio:jasypt-spring-boot-starter:3.0.5,\n" +
                "Gradle: com.google.code.findbugs:jsr305:3.0.2,\n" +
                "Gradle: com.google.errorprone:error_prone_annotations:2.36.0,\n" +
                "Gradle: com.google.guava:failureaccess:1.0.2,\n" +
                "Gradle: com.google.guava:guava:33.3.1-jre,\n" +
                "Gradle: com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava,\n" +
                "Gradle: com.google.j2objc:j2objc-annotations:3.0.0,\n" +
                "Gradle: com.googlecode.json-simple:json-simple:1.1.1,\n" +
                "Gradle: com.jayway.jsonpath:json-path:2.9.0,\n" +
                "Gradle: com.microsoft.sqlserver:mssql-jdbc:10.2.3.jre8,\n" +
                "Gradle: com.newrelic.agent.java:newrelic-api:8.16.0,\n" +
                "Gradle: com.oracle.database.jdbc:ojdbc8:21.16.0.0,\n" +
                "Gradle: com.sun.activation:jakarta.activation:1.2.2,\n" +
                "Gradle: com.sun.xml.bind:jaxb-impl:2.3.9,\n" +
                "Gradle: com.sun.xml.messaging.saaj:saaj-impl:1.5.3,\n" +
                "Gradle: com.vaadin.external.google:android-json:0.0.20131108.vaadin1,\n" +
                "Gradle: com.zaxxer:HikariCP:6.2.1,\n" +
                "Gradle: commons-codec:commons-codec:1.17.1,\n" +
                "Gradle: io.dropwizard.metrics:metrics-core:4.2.22,\n" +
                "Gradle: io.dropwizard.metrics:metrics-jmx:4.2.22,\n" +
                "Gradle: io.github.classgraph:classgraph:4.8.176,\n" +
                "Gradle: io.micrometer:micrometer-core:1.9.17,\n" +
                "Gradle: io.micrometer:micrometer-registry-jmx:1.9.17,\n" +
                "Gradle: io.netty:netty-buffer:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-codec:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-codec-dns:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-codec-http2:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-codec-http:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-codec-socks:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-common:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-handler:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-handler-proxy:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-resolver:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-resolver-dns:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-resolver-dns-classes-macos:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-transport:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-transport-classes-epoll:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-transport-native-epoll:linux-x86_64:4.1.115.Final,\n" +
                "Gradle: io.netty:netty-transport-native-unix-common:4.1.115.Final,\n" +
                "Gradle: io.projectreactor.netty:reactor-netty-core:1.0.39,\n" +
                "Gradle: io.projectreactor.netty:reactor-netty-http:1.0.39,\n" +
                "Gradle: io.projectreactor:reactor-core:3.4.41,\n" +
                "Gradle: io.springfox:springfox-core:2.9.2,\n" +
                "Gradle: io.springfox:springfox-schema:2.9.2,\n" +
                "Gradle: io.springfox:springfox-spi:2.9.2,\n" +
                "Gradle: io.springfox:springfox-spring-web:2.9.2,\n" +
                "Gradle: io.springfox:springfox-swagger2:2.9.2,\n" +
                "Gradle: io.springfox:springfox-swagger-common:2.9.2,\n" +
                "Gradle: io.springfox:springfox-swagger-ui:2.9.2,\n" +
                "Gradle: io.swagger.core.v3:swagger-annotations:2.2.26,\n" +
                "Gradle: io.swagger.core.v3:swagger-core:2.2.26,\n" +
                "Gradle: io.swagger.core.v3:swagger-integration:2.2.26,\n" +
                "Gradle: io.swagger.core.v3:swagger-jaxrs2:2.2.26,\n" +
                "Gradle: io.swagger.core.v3:swagger-models:2.2.26,\n" +
                "Gradle: io.swagger:swagger-annotations:1.5.20,\n" +
                "Gradle: io.swagger:swagger-models:1.5.20,\n" +
                "Gradle: jakarta.activation:jakarta.activation-api:1.2.2,\n" +
                "Gradle: jakarta.annotation:jakarta.annotation-api:1.3.5,\n" +
                "Gradle: jakarta.validation:jakarta.validation-api:2.0.2,\n" +
                "Gradle: jakarta.xml.bind:jakarta.xml.bind-api:2.3.3,\n" +
                "Gradle: jakarta.xml.soap:jakarta.xml.soap-api:1.4.2,\n" +
                "Gradle: javax.activation:javax.activation-api:1.2.0,\n" +
                "Gradle: javax.xml.bind:jaxb-api:2.3.1,\n" +
                "Gradle: net.bytebuddy:byte-buddy:1.12.23,\n" +
                "Gradle: net.bytebuddy:byte-buddy:1.15.4,\n" +
                "Gradle: net.bytebuddy:byte-buddy-agent:1.15.4,\n" +
                "Gradle: net.minidev:accessors-smart:2.5.0,\n" +
                "Gradle: net.minidev:json-smart:2.5.0,\n" +
                "Gradle: net.sf.jt400:jt400:20.0.7,\n" +
                "Gradle: org.apache.commons:commons-lang3:3.17.0,\n" +
                "Gradle: org.apache.httpcomponents:httpclient:4.5.14,\n" +
                "Gradle: org.apache.httpcomponents:httpcore:4.4.16,\n" +
                "Gradle: org.apache.logging.log4j:log4j-api:2.24.2,\n" +
                "Gradle: org.apache.logging.log4j:log4j-to-slf4j:2.24.2,\n" +
                "Gradle: org.apache.tomcat.embed:tomcat-embed-core:9.0.97,\n" +
                "Gradle: org.apache.tomcat.embed:tomcat-embed-el:9.0.97,\n" +
                "Gradle: org.apache.tomcat.embed:tomcat-embed-websocket:9.0.97,\n" +
                "Gradle: org.apiguardian:apiguardian-api:1.1.2,\n" +
                "Gradle: org.assertj:assertj-core:3.26.3,\n" +
                "Gradle: org.checkerframework:checker-qual:3.48.3,\n" +
                "Gradle: org.codehaus.janino:commons-compiler:3.1.10,\n" +
                "Gradle: org.codehaus.janino:janino:3.1.10,\n" +
                "Gradle: org.codehaus.woodstox:stax2-api:4.2.2,\n" +
                "Gradle: org.fusesource.jansi:jansi:2.4.1,\n" +
                "Gradle: org.hamcrest:hamcrest:3.0,\n" +
                "Gradle: org.hdrhistogram:HdrHistogram:2.1.12,\n" +
                "Gradle: org.hibernate.validator:hibernate-validator:6.2.5.Final,\n" +
                "Gradle: org.jasypt:jasypt:1.9.3,\n" +
                "Gradle: org.javassist:javassist:3.30.2-GA,\n" +
                "Gradle: org.jboss.logging:jboss-logging:3.4.3.Final,\n" +
                "Gradle: org.jetbrains:annotations:26.0.1,\n" +
                "Gradle: org.jolokia:jolokia-core:1.7.2,\n" +
                "Gradle: org.jspecify:jspecify:1.0.0,\n" +
                "Gradle: org.junit.jupiter:junit-jupiter:5.11.3,\n" +
                "Gradle: org.junit.jupiter:junit-jupiter-api:5.11.3,\n" +
                "Gradle: org.junit.jupiter:junit-jupiter-engine:5.11.3,\n" +
                "Gradle: org.junit.jupiter:junit-jupiter-params:5.11.3,\n" +
                "Gradle: org.junit.platform:junit-platform-commons:1.11.3,\n" +
                "Gradle: org.junit.platform:junit-platform-engine:1.11.3,\n" +
                "Gradle: org.jvnet.staxex:stax-ex:1.8.3,\n" +
                "Gradle: org.latencyutils:LatencyUtils:2.0.3,\n" +
                "Gradle: org.mapstruct:mapstruct:1.6.3,\n" +
                "Gradle: org.mockito:mockito-core:5.14.2,\n" +
                "Gradle: org.mockito:mockito-junit-jupiter:5.14.2,\n" +
                "Gradle: org.objenesis:objenesis:3.3,\n" +
                "Gradle: org.opentest4j:opentest4j:1.3.0,\n" +
                "Gradle: org.ow2.asm:asm:9.3,\n" +
                "Gradle: org.projectlombok:lombok:1.18.36,\n" +
                "Gradle: org.reactivestreams:reactive-streams:1.0.4,\n" +
                "Gradle: org.skyscreamer:jsonassert:1.5.3,\n" +
                "Gradle: org.slf4j:jcl-over-slf4j:1.7.36,\n" +
                "Gradle: org.slf4j:jul-to-slf4j:1.7.36,\n" +
                "Gradle: org.slf4j:log4j-over-slf4j:1.7.36,\n" +
                "Gradle: org.slf4j:slf4j-api:1.7.36,\n" +
                "Gradle: org.slf4j:slf4j-ext:1.7.36,\n" +
                "Gradle: org.springdoc:springdoc-openapi-common:1.8.0,\n" +
                "Gradle: org.springdoc:springdoc-openapi-ui:1.8.0,\n" +
                "Gradle: org.springdoc:springdoc-openapi-webmvc-core:1.8.0,\n" +
                "Gradle: org.springframework.boot:spring-boot:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-actuator:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-actuator-autoconfigure:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-autoconfigure:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-actuator:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-cache:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-jdbc:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-json:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-reactor-netty:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-test:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-tomcat:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-validation:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-web:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-starter-webflux:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-test:2.7.18,\n" +
                "Gradle: org.springframework.boot:spring-boot-test-autoconfigure:2.7.18,\n" +
                "Gradle: org.springframework.plugin:spring-plugin-core:1.2.0.RELEASE,\n" +
                "Gradle: org.springframework.plugin:spring-plugin-metadata:1.2.0.RELEASE,\n" +
                "Gradle: org.springframework.ws:spring-ws-core:3.1.8,\n" +
                "Gradle: org.springframework.ws:spring-xml:3.1.8,\n" +
                "Gradle: org.springframework:spring-aop:5.3.39,\n" +
                "Gradle: org.springframework:spring-beans:5.3.39,\n" +
                "Gradle: org.springframework:spring-context:5.3.39,\n" +
                "Gradle: org.springframework:spring-context-support:5.3.39,\n" +
                "Gradle: org.springframework:spring-core:5.3.39,\n" +
                "Gradle: org.springframework:spring-expression:5.3.39,\n" +
                "Gradle: org.springframework:spring-jcl:5.3.39,\n" +
                "Gradle: org.springframework:spring-jdbc:5.3.39,\n" +
                "Gradle: org.springframework:spring-oxm:5.3.39,\n" +
                "Gradle: org.springframework:spring-test:5.3.39,\n" +
                "Gradle: org.springframework:spring-tx:5.3.39,\n" +
                "Gradle: org.springframework:spring-web:5.3.39,\n" +
                "Gradle: org.springframework:spring-webflux:5.3.39,\n" +
                "Gradle: org.springframework:spring-webmvc:5.3.39,\n" +
                "Gradle: org.webjars:swagger-ui:5.11.8,\n" +
                "Gradle: org.xmlunit:xmlunit-core:2.9.1\n";
//                "Gradle: org.yaml:snakeyaml:2.3";
        String bisDep = "Maven: ch.qos.logback.contrib:logback-jackson:0.1.5,\n" +
                "Maven: ch.qos.logback.contrib:logback-json-classic:0.1.5,\n" +
                "Maven: ch.qos.logback.contrib:logback-json-core:0.1.5,\n" +
                "Maven: ch.qos.logback:logback-access:1.2.13,\n" +
                "Maven: ch.qos.logback:logback-classic:1.2.13,\n" +
                "Maven: ch.qos.logback:logback-core:1.2.13,\n" +
                "Maven: com.cox.amp.api:commons-exception:2.2.54,\n" +
                "Maven: com.cox.amp.api:commons-legacy:1.3.38,\n" +
                "Maven: com.cox.amp.api:commons-logging:2.2.65,\n" +
                "Maven: com.cox.amp.api:commons-newrelic:1.3.11,\n" +
                "Maven: com.fasterxml.jackson.core:jackson-annotations:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.core:jackson-core:2.15.0,\n" +
                "Maven: com.fasterxml.jackson.core:jackson-databind:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.5,\n" +
                "Maven: com.fasterxml.jackson.module:jackson-module-parameter-names:2.13.5,\n" +
                "Maven: com.fasterxml.woodstox:woodstox-core:6.4.0,\n" +
                "Maven: com.fasterxml:classmate:1.5.1,\n" +
                "Maven: com.google.guava:guava:20.0,\n" +
                "Maven: com.jayway.jsonpath:json-path:2.7.0,\n" +
                "Maven: com.microsoft.sqlserver:mssql-jdbc:10.2.3.jre8,\n" +
                "Maven: com.newrelic.agent.java:newrelic-api:7.11.1,\n" +
                "Maven: com.oracle.database.jdbc:ojdbc8:21.5.0.0,\n" +
                "Maven: com.sun.activation:jakarta.activation:1.2.2,\n" +
                "Maven: com.sun.xml.bind:jaxb-core:2.3.0.1,\n" +
                "Maven: com.sun.xml.bind:jaxb-impl:2.3.9,\n" +
                "Maven: com.sun.xml.messaging.saaj:saaj-impl:1.5.3,\n" +
                "Maven: com.vaadin.external.google:android-json:0.0.20131108.vaadin1,\n" +
                "Maven: com.zaxxer:HikariCP:4.0.3,\n" +
                "Maven: commons-codec:commons-codec:1.15,\n" +
                "Maven: io.github.classgraph:classgraph:4.8.138,\n" +
                "Maven: io.micrometer:micrometer-core:1.9.17,\n" +
                "Maven: io.netty:netty-buffer:4.1.101.Final,\n" +
                "Maven: io.netty:netty-codec:4.1.101.Final,\n" +
                "Maven: io.netty:netty-codec-dns:4.1.101.Final,\n" +
                "Maven: io.netty:netty-codec-http2:4.1.101.Final,\n" +
                "Maven: io.netty:netty-codec-http:4.1.101.Final,\n" +
                "Maven: io.netty:netty-codec-socks:4.1.101.Final,\n" +
                "Maven: io.netty:netty-common:4.1.101.Final,\n" +
                "Maven: io.netty:netty-handler:4.1.101.Final,\n" +
                "Maven: io.netty:netty-handler-proxy:4.1.101.Final,\n" +
                "Maven: io.netty:netty-resolver:4.1.101.Final,\n" +
                "Maven: io.netty:netty-resolver-dns:4.1.101.Final,\n" +
                "Maven: io.netty:netty-resolver-dns-classes-macos:4.1.101.Final,\n" +
                "Maven: io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.101.Final,\n" +
                "Maven: io.netty:netty-transport:4.1.101.Final,\n" +
                "Maven: io.netty:netty-transport-classes-epoll:4.1.101.Final,\n" +
                "Maven: io.netty:netty-transport-native-epoll:linux-x86_64:4.1.101.Final,\n" +
                "Maven: io.netty:netty-transport-native-unix-common:4.1.101.Final,\n" +
                "Maven: io.projectreactor.netty:reactor-netty-core:1.0.39,\n" +
                "Maven: io.projectreactor.netty:reactor-netty-http:1.0.39,\n" +
                "Maven: io.projectreactor:reactor-core:3.4.34,\n" +
                "Maven: io.springfox:springfox-core:2.9.2,\n" +
                "Maven: io.springfox:springfox-schema:2.9.2,\n" +
                "Maven: io.springfox:springfox-spi:2.9.2,\n" +
                "Maven: io.springfox:springfox-spring-web:2.9.2,\n" +
                "Maven: io.springfox:springfox-swagger2:2.9.2,\n" +
                "Maven: io.springfox:springfox-swagger-common:2.9.2,\n" +
                "Maven: io.springfox:springfox-swagger-ui:2.9.2,\n" +
                "Maven: io.swagger.core.v3:swagger-annotations:2.1.12,\n" +
                "Maven: io.swagger.core.v3:swagger-core:2.1.12,\n" +
                "Maven: io.swagger.core.v3:swagger-models:2.1.12,\n" +
                "Maven: io.swagger:swagger-annotations:1.5.20,\n" +
                "Maven: io.swagger:swagger-models:1.5.20,\n" +
                "Maven: jakarta.activation:jakarta.activation-api:1.2.2,\n" +
                "Maven: jakarta.annotation:jakarta.annotation-api:1.3.5,\n" +
                "Maven: jakarta.jws:jakarta.jws-api:2.1.0,\n" +
                "Maven: jakarta.validation:jakarta.validation-api:2.0.2,\n" +
                "Maven: jakarta.xml.bind:jakarta.xml.bind-api:2.3.3,\n" +
                "Maven: jakarta.xml.soap:jakarta.xml.soap-api:1.4.2,\n" +
                "Maven: jakarta.xml.ws:jakarta.xml.ws-api:2.3.3,\n" +
                "Maven: javax.activation:javax.activation-api:1.2.0,\n" +
                "Maven: javax.xml.bind:jaxb-api:2.3.1,\n" +
                "Maven: joda-time:joda-time:2.10.6,\n" +
                "Maven: net.bytebuddy:byte-buddy:1.12.23,\n" +
                "Maven: net.bytebuddy:byte-buddy-agent:1.12.23,\n" +
                "Maven: net.minidev:accessors-smart:2.4.11,\n" +
                "Maven: net.minidev:json-smart:2.4.11,\n" +
                "Maven: net.sf.jt400:jt400:10.7,\n" +
                "Maven: org.apache.commons:commons-lang3:3.5,\n" +
                "Maven: org.apache.httpcomponents:httpclient:4.5.14,\n" +
                "Maven: org.apache.httpcomponents:httpcore:4.4.16,\n" +
                "Maven: org.apache.logging.log4j:log4j-api:2.17.2,\n" +
                "Maven: org.apache.logging.log4j:log4j-to-slf4j:2.17.2,\n" +
                "Maven: org.apache.tomcat.embed:tomcat-embed-core:9.0.83,\n" +
                "Maven: org.apache.tomcat.embed:tomcat-embed-el:9.0.83,\n" +
                "Maven: org.apache.tomcat.embed:tomcat-embed-websocket:9.0.83,\n" +
                "Maven: org.apiguardian:apiguardian-api:1.1.2,\n" +
                "Maven: org.assertj:assertj-core:3.22.0,\n" +
                "Maven: org.codehaus.janino:commons-compiler:3.1.10,\n" +
                "Maven: org.codehaus.janino:janino:3.1.10,\n" +
                "Maven: org.codehaus.woodstox:stax2-api:4.2.1,\n" +
                "Maven: org.hamcrest:hamcrest:2.2,\n" +
                "Maven: org.hdrhistogram:HdrHistogram:2.1.12,\n" +
                "Maven: org.hibernate.validator:hibernate-validator:6.2.5.Final,\n" +
                "Maven: org.jboss.logging:jboss-logging:3.4.3.Final,\n" +
                "Maven: org.junit.jupiter:junit-jupiter:5.8.2,\n" +
                "Maven: org.junit.jupiter:junit-jupiter-api:5.8.2,\n" +
                "Maven: org.junit.jupiter:junit-jupiter-engine:5.8.2,\n" +
                "Maven: org.junit.jupiter:junit-jupiter-params:5.8.2,\n" +
                "Maven: org.junit.platform:junit-platform-commons:1.8.2,\n" +
                "Maven: org.junit.platform:junit-platform-engine:1.8.2,\n" +
                "Maven: org.jvnet.staxex:stax-ex:1.8.3,\n" +
                "Maven: org.latencyutils:LatencyUtils:2.0.3,\n" +
                "Maven: org.mapstruct:mapstruct:1.2.0.Final,\n" +
                "Maven: org.mockito:mockito-core:4.5.1,\n" +
                "Maven: org.mockito:mockito-junit-jupiter:4.5.1,\n" +
                "Maven: org.objenesis:objenesis:3.2,\n" +
                "Maven: org.opentest4j:opentest4j:1.2.0,\n" +
                "Maven: org.ow2.asm:asm:9.3,\n" +
                "Maven: org.projectlombok:lombok:1.18.30,\n" +
                "Maven: org.reactivestreams:reactive-streams:1.0.4,\n" +
                "Maven: org.skyscreamer:jsonassert:1.5.1,\n" +
                "Maven: org.slf4j:jul-to-slf4j:1.7.36,\n" +
                "Maven: org.slf4j:slf4j-api:1.7.36,\n" +
                "Maven: org.springdoc:springdoc-openapi-common:1.6.6,\n" +
                "Maven: org.springdoc:springdoc-openapi-ui:1.6.6,\n" +
                "Maven: org.springdoc:springdoc-openapi-webmvc-core:1.6.6,\n" +
                "Maven: org.springframework.boot:spring-boot:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-actuator:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-actuator-autoconfigure:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-autoconfigure:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-actuator:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-cache:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-jdbc:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-json:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-logging:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-reactor-netty:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-test:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-tomcat:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-validation:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-web:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-web-services:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-starter-webflux:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-test:2.7.18,\n" +
                "Maven: org.springframework.boot:spring-boot-test-autoconfigure:2.7.18,\n" +
                "Maven: org.springframework.plugin:spring-plugin-core:1.2.0.RELEASE,\n" +
                "Maven: org.springframework.plugin:spring-plugin-metadata:1.2.0.RELEASE,\n" +
                "Maven: org.springframework.ws:spring-ws-core:3.1.8,\n" +
                "Maven: org.springframework.ws:spring-xml:3.1.8,\n" +
                "Maven: org.springframework:spring-aop:5.3.31,\n" +
                "Maven: org.springframework:spring-beans:5.3.31,\n" +
                "Maven: org.springframework:spring-context:5.3.31,\n" +
                "Maven: org.springframework:spring-context-support:5.3.31,\n" +
                "Maven: org.springframework:spring-core:5.3.31,\n" +
                "Maven: org.springframework:spring-expression:5.3.31,\n" +
                "Maven: org.springframework:spring-jcl:5.3.31,\n" +
                "Maven: org.springframework:spring-jdbc:5.3.31,\n" +
                "Maven: org.springframework:spring-oxm:5.3.31,\n" +
                "Maven: org.springframework:spring-test:5.3.31,\n" +
                "Maven: org.springframework:spring-tx:5.3.31,\n" +
                "Maven: org.springframework:spring-web:5.3.31,\n" +
                "Maven: org.springframework:spring-webflux:5.3.31,\n" +
                "Maven: org.springframework:spring-webmvc:5.3.31,\n" +
                "Maven: org.webjars:swagger-ui:4.5.0,\n" +
                "Maven: org.webjars:webjars-locator-core:0.50,\n" +
                "Maven: org.xmlunit:xmlunit-core:2.9.1\n";
//                "Maven: org.yaml:snakeyaml:2.0";

//        bisDep = addMavenComma(bisDep);
//        ccmDep = addGradleComma(ccmDep);

//        int count = 0;
        String[] ccmList = ccmDep.split(",");
        Map<String, String> ccmMap = new HashMap<>();
        for(String ccmDepStr:ccmList){
//            System.out.println(++count);
            String[] str = ccmDepStr.split(":");
            ccmMap.put(str[1]+":"+str[2],str[3]);
        }

        String[] bisList = bisDep.split(",");
        Map<String, String> bisMap = new HashMap<>();

        for(String ccmDepStr:bisList){
            String[] str = ccmDepStr.split(":");
            bisMap.put(str[1]+":"+str[2],str[3]);
        }

        System.out.println("Maven : "+ccmMap.size()+" Gradle : "+bisMap.size());
        System.out.println("======== Not in Maven ========");
        for(Map.Entry<String,String> entry : bisMap.entrySet()){
            if(!ccmMap.containsKey(entry.getKey())){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

        System.out.println("======== Not in Gradle ========");
        for(Map.Entry<String,String> entry : ccmMap.entrySet()){
            if(!bisMap.containsKey(entry.getKey())){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }

    public static String addGradleComma(String str){
        String s = str;
        int index = str.indexOf("Gradle", 2);
        while(index != -1){
//        s = s.substring(0, index) + ", " + s.substring(index);
        String s1 = s.substring(0, index);
        String s2 = s.substring(index);
        str = s1 + "," + s2;
        index = str.indexOf("Gradle", index+2);
        }
        return str;
    }

    public static String addMavenComma(String str) {
        String s = str;
        int index = str.indexOf("Maven", 2);
        while (index != -1) {
//            s = s.substring(0, index) + ", " + s.substring(index);
            String s1 = s.substring(0, index);
            String s2 = s.substring(index);
            s = s1 + "," + s2;
            index = s.indexOf("Maven", index+2);
        }
        return s;
    }
}