package id.co.asyst.wfm.core.repository;

import id.co.asyst.wfm.core.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseJpaRepository<T extends Model, ID> extends JpaRepository<T,ID>
{
}
