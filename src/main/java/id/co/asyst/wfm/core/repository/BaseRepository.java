package id.co.asyst.wfm.core.repository;

import id.co.asyst.wfm.core.model.Model;
import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<T extends Model, ID> extends CrudRepository<T,ID>
{
}
