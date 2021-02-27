package id.co.asyst.wfm.core.service;


import id.co.asyst.wfm.core.BaseInterface;

import java.util.Collection;

public interface ServiceManager<T,ID> extends BaseInterface
{

    public Collection<T> findAll();
    public T findById(ID id);
    public T saveOrUpdate(T t);
    public void deleteById(ID id);
    public void delete(T t);

}
