package com.objectway.stage.example.applicationcontext.packageA;

import com.objectway.stage.example.applicationcontext.packageC.BeanC1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Field-based dependency injection drawbacks:
 * <ol>
 *     <li><strong>Disallows immutable field declaration</strong></li>
 *     <li><strong>Eases single responsibility principle violation</strong></li>
 *     <li>
 *         <strong>Tightly coupled with dependency injection container:</strong>
 *         The main reason to use field-based injection is to avoid the boilerplate code for getters and setters
 *         or creating constructors for your class. In the end, this means that the only way these fields can be
 *         set are by Spring container instantiating the class and injecting them using reflection, otherwise the
 *         fields will remain null and your class will be broken/useless.
 *
 *         The decoupling achieved for the class by autowiring its fields is lost by getting coupled again
 *         with the class injector (in this case Spring) making the class useless outside of a Spring container.
 *         This means that if you want to use your class outside the application container, for example for unit testing,
 *         you are forced to use a Spring container to instantiate your class as there is no other possible way (but reflection)
 *         to set the autowired fields.
 *     </li>
 *     <li><strong>Hidden dependencies</strong></li>
 * </ol>
 *
 * @see <a href="https://blog.marcnuri.com/field-injection-is-not-recommended/">Field injection is not recommended</a>
 */
@Component
public class BeanA3 {
    // Field-based dependency injection (not recommended)
    // In field-based dependency injection, fields/properties are annotated with @Autowired.
    // Spring container will set these fields once the class is instantiated.
    @Autowired
    private BeanC1 beanC1;

    @Override
    public String toString() {
        return "BeanA3{" +
                "beanC1=" + beanC1 +
                '}';
    }
}
