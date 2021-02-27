package id.co.asyst.wfm.core.manager;


import id.co.asyst.wfm.core.BaseInterface;

import java.util.List;


public interface Manager<T,ID> extends BaseInterface
{

    public List<T> findAll();
    public T findById(ID id);
    public T saveOrUpdate(T t);
    public void deleteById(ID id);
    public void delete(T t);



}
