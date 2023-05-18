package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class BookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Booking>> {

    @Override
    public EntityModel<Booking> process(EntityModel<Booking> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/accept")
                .withRel("accept")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/decline")
                .withRel("decline")
        );

        return model;
    }
}
