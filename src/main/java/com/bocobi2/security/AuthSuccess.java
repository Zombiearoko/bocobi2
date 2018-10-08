package com.bocobi2.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.bocobi2.dao.InternauteDAO;
import com.bocobi2.dao.ChercheurEmploiDAO;
import com.bocobi2.dao.OffreurEmploiDAO;
import com.bocobi2.model.Internaute;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.OffreurEmploi;



@Component
public class AuthSuccess implements AuthenticationSuccessHandler{
	
	@Autowired
	private InternauteDAO internauteDAO;
	@Autowired
	private OffreurEmploiDAO offreurEmploiDAO;
	@Autowired
	private ChercheurEmploiDAO chercheurEmploiDAO;
	
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_OK);
        
        String pageToRedirect = "";
    
        Authentication currentAuth = SecurityContextHolder.getContext().getAuthentication();
        String login = currentAuth.getName();
        
        Internaute internaute=internauteDAO.findByLogin(login);
        
        request.getSession().setAttribute("user", internaute);
        
        for (GrantedAuthority auth : authentication.getAuthorities()) {
            switch (auth.getAuthority()) {
            	
            	case "ROLE_ADMIN": 
            		pageToRedirect = "ROLE_ADMIN";
            	break;
            	
            	case "ROLE_INTERNAUTE": 
            		pageToRedirect = "ROLE_INTERNAUTE";
            	break;
            	
            	case "ROLE_OFFREUREMPLOI": 
            		pageToRedirect = "ROLE_OFFREUREMPLOI";
            	break;
            	
            	case "ROLE_CHERCHEUREMPLOI": 
            		pageToRedirect = "ROLE_CHERCHEUREMPLOI";
            	break;
            }
          
        }
        
        switch (pageToRedirect) {
        
	    	case "ROLE_ADMIN": 
	    		response.sendRedirect("/admin");
	    	break;
	    	
	    	case "ROLE_INTERNAUTE": 
	    		response.sendRedirect("/internaute");
	    	break;
	    	
	    	case "ROLE_OFFREUREMPLOI": 
	    		response.sendRedirect("/offreuremploi");
	    	break;
	    	
	    	case "ROLE_CHERCHEUREMPLOI": 
	    		response.sendRedirect("/chercheurempoi");
	    	break;
        }

	}
 
		
}
