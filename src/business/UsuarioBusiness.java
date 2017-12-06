package business;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("usuario")
public class UsuarioBusiness {
    @Context
    private UriInfo context;
	

    /**
     * Default constructor. 
     */
    public UsuarioBusiness() {
    }

    /**
     * Retrieves representation of an instance of UsuarioBusiness
     * @return an instance of String
     */
    @GET
    @Produces("application/text")
    public String getJson() {
        return "Teste do web service rest";
    } 

    /**
     * PUT method for updating or creating an instance of UsuarioBusiness
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }

}