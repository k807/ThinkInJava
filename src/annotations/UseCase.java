package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE_PARAMETER,ElementType.ANNOTATION_TYPE,ElementType.PACKAGE,ElementType.TYPE_USE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    int id();
    String description() default "none description";
}
