package Generic;



public class Crate<T> {
    private T contents;
    public Crate(T contents){
        this.contents = contents;
    }
    public T getContents(){
        return contents;
    }

}
