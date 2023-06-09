package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "bookings", path = "bookings")
public interface BookingRepository
    extends PagingAndSortingRepository<Booking, Long> {}
