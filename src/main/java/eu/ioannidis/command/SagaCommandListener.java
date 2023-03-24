package eu.ioannidis.command;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@MessageMapping
@Component
@KafkaListener
public @interface SagaCommandListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "id")
    String id() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactory() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default {};

    @AliasFor(annotation = KafkaListener.class, attribute = "topicPattern")
    String topicPattern() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "topicPartitions")
    TopicPartition[] topicPartitions() default {};

    @AliasFor(annotation = KafkaListener.class, attribute = "containerGroup")
    String containerGroup() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "errorHandler")
    String errorHandler() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "idIsGroup")
    boolean idIsGroup() default true;

    @AliasFor(annotation = KafkaListener.class, attribute = "clientIdPrefix")
    String clientIdPrefix() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "beanRef")
    String beanRef() default "__listener";

    @AliasFor(annotation = KafkaListener.class, attribute = "concurrency")
    String concurrency() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "autoStartup")
    String autoStartup() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "properties")
    String[] properties() default {};

    @AliasFor(annotation = KafkaListener.class, attribute = "splitIterables")
    boolean splitIterables() default true;

    @AliasFor(annotation = KafkaListener.class, attribute = "contentTypeConverter")
    String contentTypeConverter() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "batch")
    String batch() default "";
}
