package action.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



// 页面跳转控制器
@Controller
public class ForwardAction {
	private static final Logger logger = LoggerFactory.getLogger(ForwardAction.class);
	@RequestMapping("/forward")
	public ModelAndView forward(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String viewName = request.getParameter("view");
		if (StringUtils.isEmpty(viewName)) {
			logger.debug("view Is not [{}]",viewName);
			return new ModelAndView();
		}
		logger.debug("view Is [{}]",viewName);
		
		mv.setViewName(viewName);
		return mv;
	}

}
