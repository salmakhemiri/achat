package com.esprit.achat.services.Implementation;
import com.esprit.achat.repositories.MyGenericRepository;
import com.esprit.achat.services.Interface.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class GenericServiceIMP <T,ID> implements GenericService<T,ID> {

    @Autowired
    public MyGenericRepository<T,ID> myGenericRepository;

    @Override
    public List<T> retrieveAll() {
        try{
            return  myGenericRepository.findAll();
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return null;
    }

    @Override
    public void add(T t) {
        try{
            myGenericRepository.save(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }

    }

    @Override
    public void update(T t) {
        try {
            System.out.println("mise a jour avec succes");
            myGenericRepository.save(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }

    }

    @Override
    public void remove(ID id) {
        try{
            T t = myGenericRepository.findById(id).orElse(null);
            myGenericRepository.delete(t);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
    }

    @Override
    public T retrieve(ID id) {
        try{
            return  myGenericRepository.findById(id).get();
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return null;
    }

}



