package com.example.demo.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelContextWrapper {
    private final CamelContext context;

    public CamelContextWrapper(RouteBuilder... routes) throws Exception {
        this.context = new DefaultCamelContext();
        for (RouteBuilder route :routes) {
            this.context.addRoutes(route);
        }
        this.context.start();
    }

    public ProducerTemplate createProducerTemplate() {
        return this.context.createProducerTemplate();
    }

}
