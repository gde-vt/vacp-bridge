package id.co.veritrans.restfulserver.cxf;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by gde on 1/14/15.
 */
@Provider
@Consumes(value = {"application/json"})
@Produces(value = {"application/json"})
public class JacksonJsonCxfProvider implements MessageBodyReader<Object>, MessageBodyWriter<Object> {

    private JacksonJsonProvider jacksonDelegate;

    public JacksonJsonCxfProvider() {
    }

    public JacksonJsonProvider getJacksonDelegate() {
        return jacksonDelegate;
    }

    public void setJacksonDelegate(JacksonJsonProvider jacksonDelegate) {
        this.jacksonDelegate = jacksonDelegate;
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return jacksonDelegate.isReadable(type, genericType, annotations, mediaType);
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        return jacksonDelegate.readFrom(type, genericType, annotations, mediaType, httpHeaders, entityStream);
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return jacksonDelegate.isWriteable(type, genericType, annotations, mediaType);
    }

    @Override
    public long getSize(Object t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return jacksonDelegate.getSize(t, type, genericType, annotations, mediaType);
    }

    @Override
    public void writeTo(Object t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        jacksonDelegate.writeTo(t, type, genericType, annotations, mediaType, httpHeaders, entityStream);
    }
}
