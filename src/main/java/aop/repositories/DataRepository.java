package aop.repositories;


import org.springframework.stereotype.Repository;

@Repository
public class DataRepository {

    public void getDataById(Long id){
        if(id>0 && id<=100){
            System.out.println("DataRepository: user with id - "+id+" was found!");
        }
        else {
            throw new RuntimeException("no such data found!");
        }
    }
}
