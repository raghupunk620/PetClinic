package raghu.springframework.spingpetclinic.services.map;

import raghu.springframework.spingpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>{

    protected Map<Long, T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findByID(Long id){
        return map.get(id);
    }
    T save( T object){

        if(object != null){
            if( object.getId()== null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        return object ;
    }
    void deleteById(Long id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry-> entry.getValue().equals(object));
    }
    private Long getNextId()
    {
        if (map.isEmpty())
            return 1L;
        else
            return Collections.max(map.keySet()) + 1;
    }
}
