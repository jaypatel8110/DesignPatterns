package Annotation.ParentChildInheritance;
//https://stackoverflow.com/questions/12159601/why-do-we-assign-a-parent-reference-to-the-child-object-in-java

public class Test {
    public static void main(String[] args) {
        /*Parent parentObj=new Parent();
        parentObj.printName();

        Parent chidObj=new Child(); // This will over ride Parent
        chidObj.printName();;*/

        ChildImpl co=new ChildImpl();
        //co.childImpl();

        ParentInterface pi=new ChildImpl();
        pi.getMiddle();
        pi.getName();

    }
}
