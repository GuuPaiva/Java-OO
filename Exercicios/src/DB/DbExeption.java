package DB;

public class DbExeption extends RuntimeException{
    private static final long serilVersionUID = 1l;

    public DbExeption(String msg){
        super(msg);
    }
}
