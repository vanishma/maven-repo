# util

自己使用的工具jar

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

对象转换工具 需要用到 org.springframework.beans.BeanUtils 包 如项目中没有引用不能能使用 或者单独引用

```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.2.5.RELEASE</version>
    <scope>compile</scope>
</dependency>
```