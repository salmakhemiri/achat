package Services;
import Repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenericServiceIMP <T,ID> implements GenericService<T,ID> {
    @Autowired
    public GenericRepository<T,ID> genericRepository ;

    @Override
    public List<T> retrieveAll() {
        try{
            return  genericRepository.findAll();
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return null;
    }

    @Override
    public void add(T t) {
        try{
            genericRepository.save(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }

    }

    @Override
    public void update(T t) {
        try {
            System.out.println("mise a jour avec succes");
            genericRepository.save(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }

    }

    @Override
    public void remove(ID id) {
        try{
            T t = genericRepository.findById(id).orElse(null);
            genericRepository.delete(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
    }

    @Override
    public T retrieve(ID id) {
        try{
            return  genericRepository.findById(id).get();
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return null;
    }

}



