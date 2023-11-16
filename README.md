# Backend project to generate a webpage with Thymeleaf

This is a Spring Boot project which includes Thymeleaf HTML page generation.

Link of the video with more details: <>

The goal of this project is to show the usage of the most important features of Thymeleaf:
* Variable Expression: `${...}`: Variables in the model can be accessed using the variable expression. For example, `${user.name}` would retrieve the 'name' property from the 'user' object in the model.
* Iteration: `th:each="item : ${items}"`: Thymeleaf provides a convenient way to iterate over collections using the th:each attribute. This is useful for rendering lists or tables dynamically.
* Conditional Rendering: `th:if`, `th:unless`, `th:switch`, `th:case`: Thymeleaf supports conditional rendering with attributes like `th:if` and `th:unless`. The `th:switch` and `th:case` attributes are used for switch-case-like structures.
* Fragment Inclusion: `th:include`: Thymeleaf allows the inclusion of template fragments using the `th:include` attribute. This is useful for creating modular and reusable components.
* Text and Message Resolution: `#{...}`: Thymeleaf provides support for internationalization and localization. Text and messages can be resolved using the `#{...}` syntax.
* Linking: `th:href`, `th:src`: Thymeleaf can be used to dynamically generate links and resource URLs using attributes like `th:href` and `th:src`. This is helpful when working with dynamic URLs or resources.
* Fragment Selection: `th:fragment`: Thymeleaf provides the th:fragment attribute for defining named fragments within a template. These fragments can be included or replaced in other templates.


## Build

To build the project, run the following command:
```
mvn clean package
```

## Run

To start the application, run the following command:
```
mvn spring-boot:run
```

The Thymeleaf rendered page will be available at `http://localhost:8080/export`.

The variable `showDetails` is optional but can be added to the URL as a query parameter to display more details in with the Thymeleaf template: `http://localhost:8080/export?showDetails=true`.

The content is rendered in English by default. If you want it to be displayed in Spanish, you must use the Header `Accept-Language: es` when requesting the previous endpoint.


