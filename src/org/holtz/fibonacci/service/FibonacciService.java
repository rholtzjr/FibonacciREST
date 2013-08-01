package org.holtz.fibonacci.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.holtz.fibonacci.Fibonacci;
import org.holtz.fibonacci.bean.FibonacciBean;

@Path("fibservice")
public class FibonacciService {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    public FibonacciService() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @GET
    @Path("intFib/{count}/")
    @Produces(MediaType.APPLICATION_XML)
    public FibonacciBean getFib(@PathParam("count") int count) {
        FibonacciBean fibBean = new FibonacciBean();
        Fibonacci fib = new Fibonacci();
        fibBean.setIndex(fib.getSequence(count));

        return fibBean;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @GET
    @Path("bigFib/{count}")
    @Produces(MediaType.APPLICATION_XML)
    public FibonacciBean getBigFib(@PathParam("count") int count) {
        FibonacciBean fibBean = new FibonacciBean();
        Fibonacci fib = new Fibonacci();
        fibBean.setIndex(fib.getBigSequence(count));

        return fibBean;
    }
}
