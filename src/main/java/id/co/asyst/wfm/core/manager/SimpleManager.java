package id.co.asyst.wfm.core.manager;

import java.util.List;

public class SimpleManager<SimpleModel,ID> extends BaseManager<SimpleModel,ID>
{

    @Override
    public List<SimpleModel> findAll() {
        return null;
    }

    @Override
    public SimpleModel findById(ID id) {
        return null;
    }

    @Override
    public SimpleModel saveOrUpdate(SimpleModel simpleModel) {
        return null;
    }

    @Override
    public void deleteById(ID id) {
    }

    @Override
    public void delete(SimpleModel simpleModel) {
    }
}
