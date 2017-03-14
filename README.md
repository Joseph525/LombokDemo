###简介
Lombok 提供了简单的注解的形式来帮助我们简化消除一些必须有但显得很臃肿的 java 代码。

###官网
http://projectlombok.org/

###安装
现在IDE功能都比较强大，IDEA已经集成好，无需手工安装，只需要在项目的pom文件中引入lombok包即可，依赖配置如下：
```
<dependency>
	<groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
	<version>1.16.10</version>
	<scope>provided</scope>
</dependency>
```

###支持的注解
* @NonNull
* @Cleanup
* @Getter / @Setter
* @ToString
* @EqualsAndHashCode
* @NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor
* @Data
* @Value
* @Builder
* @SneakyThrows
* @Synchronized
* @Getter(lazy=true)
* @Log

详细解释参考官网：https://projectlombok.org/features/index.html