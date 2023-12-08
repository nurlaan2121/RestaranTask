package models.servises;

public class GeneratorId {
    public static Long id = 0L;
    public static Long generate(){
        return ++id;
    }
}
