package Generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class MyGenericClass<Thing> {
    Thing t;

    public MyGenericClass(Thing t) {
        this.t = t;
    }

    public Thing getT() {
        return t;
    }

    public void setT(Thing t) {
        this.t = t;
    }
}
