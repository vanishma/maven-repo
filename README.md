# util

自己使用的工具jar

```
<repositories>
    <repository>
        <id>mqh-util</id>
        <url>https://github.com/vanishma/util/repo</url>
    </repository>
</repositories>


<dependency>
    <groupId>com.maqh</groupId>
    <artifactId>util</artifactId>
    <version>1.0-SNAPSHOT</version>
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