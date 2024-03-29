package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class ProcessAnnotationExample {

    //https://howtodoinjava.com/java/annotations/complete-java-annotations-tutorial/


    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        //  new DemoClass();
        Class<DemoClass> demoClassObj = DemoClass.class;
        readAnnotationOn(demoClassObj);
        Method method = demoClassObj.getMethod("getString");
        readAnnotationOn(method);
    }

    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\n Finding annotations on " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavaFileInfo) {
                    JavaFileInfo fileInfo = (JavaFileInfo) annotation;
                    System.out.println("Author :" + fileInfo.author());
                    System.out.println("Version :" + fileInfo.version());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}