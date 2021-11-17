package projetArticle.filter;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter(filterName = "f1")
public class LogFilter implements Filter {

	public LogFilter(){}
	
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter destroy !!");
			
	}
	
	@Override
	public void destroy() {
		System.out.println("Filter destroy !!");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	HttpServletRequest request = (HttpServletRequest) req;
	String servletPath = request.getServletPath();
	System.out.println("#INFO " + new Date()
			+ "- ServletPath : " + servletPath + ", URL : "
			+ request.getRequestURL());
	filterChain.doFilter(req, res);
			
	}

}
