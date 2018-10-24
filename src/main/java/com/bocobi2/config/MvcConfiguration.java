package com.bocobi2.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.bocobi2.dao.CVDAO;
import com.bocobi2.dao.CVDAOImpl;
import com.bocobi2.dao.ChercheurEmploiDAO;
import com.bocobi2.dao.ChercheurEmploiDAOImpl;
import com.bocobi2.dao.InternauteDAO;
import com.bocobi2.dao.InternauteDAOImpl;
import com.bocobi2.dao.OffreEmploiDAO;
import com.bocobi2.dao.OffreEmploiDAOImpl;
import com.bocobi2.dao.OffreurEmploiDAO;
import com.bocobi2.dao.OffreurEmploiDAOImpl;
import com.bocobi2.dao.ProfilDeRechercheDAO;
import com.bocobi2.dao.ProfilDeRechercheDAOImpl;
import com.bocobi2.model.UserDetailsServices;

@PropertySource(value = { "classpath:application.properties" })
@Configuration
@ComponentScan(basePackages = "com.bocobi2")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter
{

	@Autowired
	Environment env;

	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver createMultipartResolver()
	{
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		resolver.setMaxUploadSize(999999999);
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.userName"));
		dataSource.setPassword(env.getProperty("db.userPassword"));
		return dataSource;
	}

	@Bean
	public InternauteDAO getInternauteDAO()
	{
		return new InternauteDAOImpl(getDataSource());
	}

	@Bean
	public ChercheurEmploiDAO getChercheurEmploiDAO()
	{
		return new ChercheurEmploiDAOImpl(getDataSource());
	}

	@Bean
	public CVDAO getCVDAO()
	{
		return new CVDAOImpl(getDataSource());
	}

	@Bean
	public OffreurEmploiDAO getOffreurEmploiDAO()
	{
		return new OffreurEmploiDAOImpl(getDataSource());
	}

	@Bean
	public OffreEmploiDAO getOffreEmploiDAO()
	{
		return new OffreEmploiDAOImpl(getDataSource());
	}

	@Bean
	public ProfilDeRechercheDAO getProfilDeRechercheDAO()
	{
		return new ProfilDeRechercheDAOImpl(getDataSource());
	}

	 @Bean
	 public UserDetailsService getUserDetailsServices(){
	 return new UserDetailsServices();
	 }

	// @Bean
	// public UserDetailsService getUserDetailsServices(){
	// return new UserDetailsServices();
	// }

}
