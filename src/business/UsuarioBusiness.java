package business;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;

import domain.Usuario;
import service.UsuarioService;
import util.ConnectionDatabase;

@Path("usuario")
public class UsuarioBusiness {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;
    ConnectionDatabase database = new ConnectionDatabase();
    UsuarioService usuarioService;
	
    private List<Usuario> usuarios;
    	

    /**
     * Default constructor. 
     */
    public UsuarioBusiness() {
    	//usuarioService = new UsuarioService(database);
    }

    /**
     * Retrieves representation of an instance of UsuarioBusiness
     * @return an instance of String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        
        //usuarioService.criarConta("Laura Pausini", 7, "vdqa");
        
        //String retorno = gson.toJson(usuarioService);
        
        //database.desconectar();
        
        return gson.toJson("Olá Mundo");
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