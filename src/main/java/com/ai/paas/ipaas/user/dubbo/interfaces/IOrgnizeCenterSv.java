package com.ai.paas.ipaas.user.dubbo.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.paas.ipaas.user.dubbo.vo.OrgnizeCenterVo;
import com.ai.paas.ipaas.PaasException;

@Path("/orgnize/Center")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface IOrgnizeCenterSv {
	@Path("/getOrgnizeCenterByStatus")
	@POST
	public List<OrgnizeCenterVo> getOrgnizeCenterByStatus(Integer status) throws PaasException;

}
