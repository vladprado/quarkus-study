package com.vladprado.micrometer;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.Timer;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.LinkedList;
import java.util.NoSuchElementException;

@Path("/example")
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

    private final MeterRegistry registry;
    private final LinkedList<Long> list = new LinkedList<>();

    ExampleResource(MeterRegistry registry) {
        this.registry = registry;
        registry.gaugeCollectionSize("example.list.size", Tags.empty(), list);
    }

    @GET
    @Path("/prime/{number}")
    public String checkIfPrime(@PathParam("number") long number) {
        if(number < 1) {
            registry.counter("example.prime.number", "type", "not-natural")
                    .increment();
            return "Only natural numbers can be prime numbers.";
        }
        if(number == 1) {
            registry.counter("example.prime.number", "type", "one")
                    .increment();
            return number + " is not prime.";
        }
        if(number % 2 == 0) {
            registry.counter("example.prime.number", "type", "even")
                    .increment();
            return number + " is not prime.";
        }
        if(timedTestPrimeNumber(number)) {
            registry.counter("example.prime.number", "type", "prime")
                    .increment();
            return number + " is prime.";
        } else {
            registry.counter("example.prime.number", "type", "not-prime")
                    .increment();
            return number + " is not prime.";
        }
    }

    @GET
    @Path("gauge/{number}")
    public Long checkListSize(@PathParam("number") long number) {
        if(number == 2 || number %2 == 0) {
            list.add(number);
        } else {
            try {
                number = list.removeFirst();
            } catch (NoSuchElementException nse) {
                number = 0;
            }
        }
        return number;
    }

    protected boolean timedTestPrimeNumber(long number) {
        Timer.Sample sample = Timer.start(registry);
        boolean result = testPrimeNumber(number);
        sample.stop(registry.timer("example.prime.number.test", "prime", result + ""));
        return result;
    }

    protected boolean testPrimeNumber(long number) {
        for(int i = 3; i < Math.floor(Math.sqrt(number)) + 1; i = i + 2) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
