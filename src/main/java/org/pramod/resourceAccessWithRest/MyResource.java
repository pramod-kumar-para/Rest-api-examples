package org.pramod.resourceAccessWithRest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.pramod.resourceAccessWithRest.MongoResource.GetFromMongoDB;
@Path("myresource")
public class MyResource {
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@PathParam("id") int id) {
        return GetFromMongoDB.getResource(id).toString();

    }
}
