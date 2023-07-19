public interface ICatalogo<T> {

    public List<T> read(FiltroPrenotazioni filtro){

    }

    public void add(T record){

    }

    public void update (int id, T newRecord){

    }

    public void delete (int id){

    }

}