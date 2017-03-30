package camelRest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationScoped
@Named("JsonProvider")
@Provider
public class JsonProvider extends JacksonJsonProvider
{
    @Override
    public void writeTo(Object value, Class<?> type, Type genericType, Annotation[] annotations, 
            MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) 
            throws IOException
    {
        super.writeTo(value, type, genericType, annotations, mediaType, httpHeaders, entityStream);
    }
}