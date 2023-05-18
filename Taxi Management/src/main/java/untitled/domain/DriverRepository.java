package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "drivers", path = "drivers")
public interface DriverRepository
    extends PagingAndSortingRepository<Driver, String> {}
