package com.cristi.simple.spring.simplespring.exercises.ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/*Suppose we want to externalise our error messages so we can modify them easily.
* Make use of spring's property injection and inject the error messages
* from src/main/resources/application.properties into these catalog of errors.
*
* You have to inject properties:
* error.page.not.found
* error.user.forbidden
*
* Modify this class without creating any additional methods, constructors or using "=" attribution
* on its properties: pageNotFoundErrorMessage, userForbiddenErrorMessage
*
* Hint: use annotations
*
* */
@Service
public class CatalogOfErrors {
    private String pageNotFoundErrorMessage;
    private String userForbiddenErrorMessage;

    public String getPageNotFoundErrorMessage() {
        return pageNotFoundErrorMessage;
    }
    public String getUserForbiddenErrorMessage() {
        return userForbiddenErrorMessage;
    }
}
