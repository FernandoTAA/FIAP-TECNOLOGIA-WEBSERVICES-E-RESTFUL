package fiap.scj.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.research.ws.wadl.Option;

@Path("/aluno")
public class AlunoResource {

	private static List<Aluno> retorno = new ArrayList<Aluno>() {
		{
			add(new Aluno("João", 1));
			add(new Aluno("Maria", 2));
			add(new Aluno("Cristina", 3));
		}
	};

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Aluno> getAllAlunos() {
		return retorno;
	}

	@GET
	@Path("/{ra}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Aluno findAluno(@PathParam("ra") Integer ra) {
		return findByRA(ra);
	}

	@GET
	@Path("/search")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Aluno search(@QueryParam("ra") Integer ra) {
		return findByRA(ra);
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createAluno(Aluno aluno) throws Exception {
		retorno.add(aluno);
		return Response.created(new URI("http://localhost:8080/restful.server/aluno/" + aluno.getRa())).build();
	}

	private Aluno findByRA(Integer ra) {
		for (Aluno aluno : retorno) {
			if (aluno.getRa().equals(ra)) {
				return aluno;
			}
		}
		return null;
	}

}
