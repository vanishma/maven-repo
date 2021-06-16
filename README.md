# util

工具类maven 引用方法

```
 <repository>
    <id>vanish-public-snapshots</id>
    <url>https://jitpack.io</url>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
    </snapshots>
</repository>

<dependency>
    <groupId>com.github.vanishma</groupId>
    <artifactId>utils</artifactId>
    <version>main-SNAPSHOT</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
