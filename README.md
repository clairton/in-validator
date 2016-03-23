# in-validator[![Build Status](https://drone.io/github.com/clairton/in-validator/status.png)](https://drone.io/github.com/clairton/in-validator/latest)

Bean Validation for collection values in;

```java
@Entity
public class Model {
	....
	@In(valids = {"http", "ftp", "https"})
	private String protocol;
	...
}
```

Para usar será necessário adicionar os repositórios maven:

```xml
<in-validator>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</in-validator>
<in-validator>
	<id>mvn-repo-snapshot</id>
	<url>https://raw.github.com/clairton/mvn-repo/snapshots</url>
</in-validator>
```
 Também adicionar as depêndencias:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
	<artifactId>in-validator</artifactId>
	<version>0.1.0</version>
</dependency>
```
