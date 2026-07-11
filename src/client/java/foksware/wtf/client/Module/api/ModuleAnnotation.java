package foksware.wtf.client.Module.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleAnnotation {
    String name();
    String desc() default "ТЦК"; //тут только 3 кнопки
    ModuleColoumn type();
}
