package Annotation.ParentChildInheritance;

public class ChildImpl implements ParentInterface {
    @Override
    public void getName() {
        System.out.println("Getnamecalled");
    }

    @Override
    public void getMiddle() {
        System.out.println("getMiddle");

    }

    public void getChildImpl(){
        System.out.println(" Child Method");

    }
}
