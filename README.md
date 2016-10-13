# Spring ( boot ) 에서 @EnableXXX 설정 활성화

### 기본 생성시 
 
```

@SpringBootApplication
public class StudySpringEnableAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringEnableAnnotationApplication.class, args);
	}
}

```

### Enable Annotation 만들기 

```

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnableRestTemplate {
	
}

```

### Spring RestTemplate 를 bean으로 등록하는 Configuration를 만든다. 

```

@Configuration
public class RestTemplateConfiguration {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}

```

### 생성했던 @EnableRestTemplate에 해당 Configuration을 Import시킨다.

```

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(RestTemplateConfiguration.class)
public @interface EnableRestTemplate {
	
}

```

### 마지막으로 운영의 Configuration에 @Enable... 을 걸어주면 된다.
 
```

@SpringBootApplication
@EnableRestTemplate
public class StudySpringEnableAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringEnableAnnotationApplication.class, args);
	}
}

```



 