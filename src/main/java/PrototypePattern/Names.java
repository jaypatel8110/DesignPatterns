package PrototypePattern;

public enum Names {

    MOVIE("movie"),
    ALBUM("album"),
    SHOW("show");

    private String name;

    Names(String name){
        this.name=name;
    }

    public String getvalue(){
        return name;
    }

}
