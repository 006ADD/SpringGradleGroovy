package org.add.spring.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.util.Arrays;

@Component
public class InjectBeanPostProcessor implements BeanPostProcessor,ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        for (Class<?> field : bean.getClass().getDeclaredClasses()) {
//            if (field.isAnnotationPresent(InjectBean.class)) {
//                Object beanToInject = applicationContext.getBean(field.getTypeName());
//                ReflectionUtils.makeAccessible(field);
//                ReflectionUtils.setField(field, bean, beanToInject);
//            }
//        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
