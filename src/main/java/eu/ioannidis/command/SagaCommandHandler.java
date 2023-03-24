package eu.ioannidis.command;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD,ANNOTATION_TYPE})
@Retention(RUNTIME)
@MessageMapping
@KafkaHandler
public @interface SagaCommandHandler {

    @AliasFor(annotation = KafkaHandler.class, attribute = "isDefault")
    boolean isDefault() default false;

}
