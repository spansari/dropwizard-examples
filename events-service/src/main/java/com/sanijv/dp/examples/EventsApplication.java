package com.sanijv.dp.examples;

import com.sanijv.dp.examples.core.DummyEventRepository;
import com.sanijv.dp.examples.core.EventRepository;
import com.sanijv.dp.examples.resources.EventResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.text.SimpleDateFormat;

public class EventsApplication extends Application<EventsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EventsApplication().run(args);
    }

    @Override
    public String getName() {
        return "Events";
    }

    @Override
    public void initialize(final Bootstrap<EventsConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EventsConfiguration configuration,
                    final Environment environment) {
        environment.getObjectMapper().setDateFormat(new SimpleDateFormat(configuration.getDateFormat()));

        EventRepository repository = new DummyEventRepository();
        EventResource eventResource = new EventResource(repository);
        environment.jersey().register(eventResource);
    }

}
