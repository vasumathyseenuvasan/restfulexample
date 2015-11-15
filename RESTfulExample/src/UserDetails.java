
import java.net.URI;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.*;

@Path("/userDetails")
public class UserDetails {

//	@GET
//	@Path("/data")
//	@Produces({MediaType.APPLICATION_JSON})
//	public User userDetailsResponse(@QueryParam("name") String name, @QueryParam("id") int id)
//	{
//		User userSample = new User();
////		if(name != null && id != 0)
////		{
////			Integer userId = new Integer(id);
////			userSample.setUserId(userId);
////			userSample.setUserName(name);
////		}
//		return userSample;
//	}
	
	@POST
	@Path("/data")
		
	@Consumes({MediaType.APPLICATION_XML})
	public String userDetailsResponse(User userOne)
	{
//		User userSample = new User();
//		if(userOne.getUserName() != null && userOne.getUserId() != 0)
//		{
//			Integer userId = new Integer(userOne.getUserId());
//			userSample.setUserId(userId);
//			userSample.setUserName(userOne.getUserName());
//		}
		return "Success";
	}
}
